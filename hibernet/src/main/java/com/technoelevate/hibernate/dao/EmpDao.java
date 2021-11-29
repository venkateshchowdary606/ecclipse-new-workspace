package com.technoelevate.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.technoelevate.hibernet.dto.Employee;

public class EmpDao {

	public static void main(String[] args) {
      EntityManagerFactory factory=null;
      EntityManager createEntityManager=null;
      EntityTransaction transaction=null;
      
     try {
    	 factory = Persistence.createEntityManagerFactory("hibernate");
    	    createEntityManager = factory.createEntityManager();
    	    transaction = createEntityManager.getTransaction();
    	    transaction.begin();
    	    
//    	    Employee emp=new Employee();
//    		emp.setEid(300);
//    		emp.setEname("balla");
//    		emp.setDesig("developer");
//    		emp.setSal(5555);
//    		emp.setAge(85);
//    		emp.setDate("19-07-1892");
//    		
//    		createEntityManager.persist(emp);
//    		transaction.commit();
    	    
    	    Employee find = createEntityManager.find(Employee.class, 100);
    	    System.out.println(find);
    	    
		
	} catch (Exception e) {
		System.err.println("unit name is may be wrong!!!!!!!!!!!!!!!!!!");
	} 
   
		
//		Employee find = createEntityManager.find(Employee.class, 1);
//		
//		System.out.println(find);
		
//		createEntityManager.persist(emp);
//		transaction.commit();                                       
//		
		
	}

}
