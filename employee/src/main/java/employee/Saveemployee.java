package employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Saveemployee {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
		
		employee.setAge(23);
		employee.setDesignation("CEO");
		employee.setId(01);
		employee.setName("Sachin");
		employee.setSalary(35000.00);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.rollback();
	}

}
