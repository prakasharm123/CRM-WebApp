package com.telusko.repo;





import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.entity.Customer;

@Repository
public interface ICustomerRepo extends CrudRepository<Customer, Integer> {
	
	public List<Customer> findByNameContainingIgnoreCaseAndDesignationContainingIgnoreCase(String name,String designation);
	
	
//	public Customer searchCustomerByID(Integer id);
//	public List<Customer> searchCustomerByName(String name);
//	public List<Customer> searchCustomerByDesignation(String designation);

	

}
