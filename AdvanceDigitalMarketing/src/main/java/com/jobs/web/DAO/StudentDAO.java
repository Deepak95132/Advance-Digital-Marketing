package com.jobs.web.DAO;

import java.beans.Beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jobs.web.beans.StudentBean;

public class StudentDAO {

	private	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	public void addStudent(StudentBean student) {



	Session session=factory.openSession();
	session.getTransaction().begin();
	session.persist(student);
session.getTransaction().commit();
	session.close();

	
	}
	public void updateStudent(StudentBean student) {
		Session session=factory.openSession();
		session.getTransaction().begin();
		
		session.close();
	}
	/*public StudentBean  viewStudent(String roll,String classId,Integer year) {
		Session session=factory.openSession();
		
		return student;
	}*/
	/*public void deleteStudent(String roll,String classId,Integer year) {
		Session session=factory.openSession();
		session.getTransaction().begin();
		StudentPrimaryKey st=new StudentPrimaryKey();
		st.setClassId(classId);
		st.setRollNo(roll);
		st.setYear(year);
		StudentBean student=session.get(StudentBean.class, st);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}*/
	/*public static void main(String[] args) {
		StudentBean bean=new StudentBean();
		bean.setStudentName("deepak");
		bean.setPhoneNumber(1234567890l);
		bean.setAddress("hodal");
		StudentDAO dao=new StudentDAO();
		dao.addStudent(bean);
		
	}*/
}
