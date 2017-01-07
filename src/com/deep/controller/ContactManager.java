package com.deep.controller;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;

import com.deep.model.Contact;
import com.deep.model.Employee;
import com.deep.util.HibernateUtil;

public class ContactManager extends HibernateUtil {

	public Contact add(Contact contact) {
		// Session session =
		// HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		return contact;
	}

	public Contact delete(int i) {
		// Session session =
		// HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Contact contact = (Contact) session.load(Contact.class, i);
		if (null != contact) {
			session.delete(contact);
		}
		session.getTransaction().commit();
		return contact;
	}

	public List<Contact> list() {

		// Session session =
		// HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Contact> contacts = null;
		try {
			Query qry = session.createQuery("from Contact");

			contacts = (List<Contact>) qry.list();

		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return contacts;
	}

	public boolean register(Employee emp) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		
		return true;
	}

	public boolean isUserRegistered(Employee emp) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		String hql = "FROM Employee E WHERE E.email ='"+emp.getEmail()+"' and E.password='"+ emp.getPassword()+"'";
		Query query = session.createQuery(hql);
		List results;
		try {
			results = query.list();
			if(results.size()>=1)
				return true;
		} catch (HibernateException e) {
			
			e.printStackTrace();
			return false;
		}
		return false;
		
		
		
	}
}