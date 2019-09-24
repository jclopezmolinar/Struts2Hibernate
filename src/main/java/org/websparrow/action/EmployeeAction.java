package org.websparrow.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.websparrow.listener.HibernateListener;
import org.websparrow.model.Employee;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Object> {

	private static final long serialVersionUID = 5310658351269189589L;
	Employee employee = new Employee();
	String submitType;
	List<Employee> empList = new ArrayList<Employee>();

	@Override
	public String execute() throws Exception{
		return SUCCESS;
	}
	
	public Object getModel() {
		return employee;
	}
	
	public String addEmployee() throws Exception{
		Session session = sessionActivities();
		session.save(employee);
		queryCreation(session);
		return SUCCESS;
	}
	
	public String fetchEmployee() throws Exception{
		Session session = sessionActivities();
		queryCreation(session);
		return SUCCESS;
	}
	
	public String deleteEmployee() throws Exception{
		Session session = sessionActivities();
		session.delete(employee);
		queryCreation(session);
		return SUCCESS;
	}
	
	public String updateEmployee() throws Exception{
		Session session = sessionActivities();
		employee.setEmpName(employee.getEmpName());
		session.update(employee);
		queryCreation(session);
		return "UPDATE";
	}
	
	private Session sessionActivities() throws Exception{
		SessionFactory sessionFactory = (SessionFactory) ServletActionContext.getServletContext().getAttribute(HibernateListener.KEY_NAME);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
	}
	
	@SuppressWarnings("unchecked")
	private void queryCreation(Session session) throws Exception{
		session.getTransaction().commit();
		empList = null;
		empList = session.createQuery("from Employee").list();
	}
	
	public List<Employee> getEmpList(){
		return empList;
	}
	
	public void setEmpList(List<Employee> empList){
		this.empList = empList;
	}
	
	public String getSubmitType(){
		return submitType;
	}
	
	public void setSubmitType(String submitType){
		this.submitType = submitType;
	}
}
