package com.telusko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.entity.Customer;
import com.telusko.repo.ICustomerRepo;


@Service
public class CustomerService implements ICustomerService {

	private ICustomerRepo repo;
	
	@Autowired
	public void setRepo(ICustomerRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<Customer> getAllCustomer() {
		
		return (List<Customer>) repo.findAll();
	}

	@Override
	public void registerCustomer(Customer customer) {
			repo.save(customer);
	}

	@Override
	public void deleteCustomerById(Integer id) {
		repo.deleteById(id);;
	}

	@Override
	public List<Customer> searchCustomer(String name, String designation) {
		
		if(name == null) {
			name="";
		}
		
		if(designation == null) {
			designation="";
		}
		
		return repo.findByNameContainingIgnoreCaseAndDesignationContainingIgnoreCase(name, designation);
	}

//	@Override
//	public Customer findCustomerByID(Integer id) {
//		return repo.searchCustomerByID(id);
//	}
//
//	@Override
//	public List<Customer> findCustomerByName(String name) {	
//		return repo.searchCustomerByName(name);
//	}
//
//	@Override
//	public List<Customer> findCustomerByDesignation(String designation) {
//		return repo.searchCustomerByDesignation(designation);
//	}

}
