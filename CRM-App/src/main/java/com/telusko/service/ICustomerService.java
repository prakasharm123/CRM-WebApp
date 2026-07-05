package com.telusko.service;

import java.util.List;


import com.telusko.entity.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomer();
	public void registerCustomer(Customer customer);
	public void deleteCustomerById(Integer id);
	public List<Customer> searchCustomer(String name, String designation);
	
	//public void login(Admin admin);
//	public Customer findCustomerByID(Integer id);
//	public List<Customer> findCustomerByName(String name);
//	public List<Customer> findCustomerByDesignation(String designation);	
}
