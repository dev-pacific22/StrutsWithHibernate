package com.deep.view;

import java.util.List;

import com.deep.controller.ContactManager;
import com.deep.model.Contact;
import com.deep.model.Employee;

 
import com.opensymphony.xwork2.ActionSupport;
 
 
public class ContactAction extends ActionSupport {
 
    private static final long serialVersionUID = 9149826260758390091L;
    private Contact contact;
    private Employee emp;
    private List<Contact> contactList;
    private Long id;
 
    private ContactManager contactManager;
 
    public ContactAction() {
        contactManager = new ContactManager();
    }
 
    public String execute() {
        this.contactList = contactManager.list();
        System.out.println("execute called");
        return "success";
    }
 
    public String loginEmployee() {
    	boolean isUser= contactManager.isUserRegistered(emp);
        System.out.println("execute called");
        if(!isUser)
		{
	        	addActionError("You entered wrong userName or Password!");
	        	return INPUT;
		}

        else{
        return SUCCESS;
        }
        	
        
    }
    
    public String registerEmployee() {
    	print(emp);
        boolean isRegister= contactManager.register(emp);
        System.out.println("execute called");
        if(isRegister)
        return SUCCESS;
        else 
        return ERROR;
    }
    
    
    
    public String add() {
        System.out.println(getContact());
        try {
            contactManager.add(getContact());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.contactList = contactManager.list();
        return SUCCESS;
    }
 
    public String delete() {
        contactManager.delete(emp.getId());
        return SUCCESS;
    }
 
    public Contact getContact() {
        return contact;
    }
 
    public List<Contact> getContactList() {
        return contactList;
    }
 
    public void setContact(Contact contact) {
        this.contact = contact;
    }
 
    public void setContactList(List<Contact> contactsList) {
        this.contactList = contactsList;
    }
 
  
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	/*public void validate(){
	    boolean isUser= contactManager.isUserRegistered(emp);
        System.out.println("execute called");
        if(!isUser)
		{
	        	addActionError("I don't know you, dont try to hack me!");
		}

	}*/
	
	
	
	
}
