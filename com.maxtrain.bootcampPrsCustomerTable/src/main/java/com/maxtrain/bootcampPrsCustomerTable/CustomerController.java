package com.maxtrain.bootcampPrsCustomerTable;

import java.util.Optional;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxtrain.bootcampPrsCustomerTable.Respository.CustomerRepository;

import ch.qos.logback.classic.Logger;

@CrossOrigin
@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerRepository customerRepo;
	
	@GetMapping()
	public Iterable<Customer> GetAllCustomers() {
		logger.info("Entering get all customers()");
		return customerRepo.findAll();
	}
	@GetMapping("/{id}")
	public Customer GetCustomer(@PathVariable Integer id) {
		logger.info("Entering get customers({})", id);
		if(id == null) 
			return null;
		try {
			Optional<Customer> customerOpt =  customerRepo.findById(id);
			return customerOpt.isPresent() ? customerOpt.get() : null;
		} catch (IllegalArgumentException e) {
			logger.error("Exception: "+ e.getMessage() +" in customer controller get customer()");
			return null;
		}
	}
	@PostMapping()
	public Customer InsertCustomer(@RequestBody Customer customer) {
		logger.info("Entering insert customer()");
		if(customer == null) 
			return null;
		try {
			return customerRepo.save(customer);
		} catch (IllegalArgumentException e) {
			logger.error("Exception: "+ e.getMessage() +" in customer controller insert customer()");
			return null;
		}
	}
	@PutMapping()
	public Customer UpdateCustomer(@RequestBody Customer customer) {
		logger.info("Entering update customer()");
		if(customer == null) 
			return null;
		try {
			return customerRepo.save(customer);
		} catch (IllegalArgumentException e) {
			logger.error("Exception: "+ e.getMessage() +" in customer controller update customer()");
			return null;
		}	}
	@DeleteMapping()
	public void DeleteCustomer(@RequestBody Customer customer) {
		logger.info("Entering delete customer()");
		if(customer == null) 
			return;
		try {
			customerRepo.deleteById(customer.getId());
		} catch (IllegalArgumentException e) {
			logger.error("Exception: "+ e.getMessage()+ " in customer controller get customer()");
		}	
	
	}
}