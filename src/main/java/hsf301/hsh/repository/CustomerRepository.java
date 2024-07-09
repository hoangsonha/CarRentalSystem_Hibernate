package hsf301.hsh.repository;

import java.util.List;

import hsf301.hsh.dao.CarDAO;
import hsf301.hsh.dao.CustomerDAO;
import hsf301.hsh.pojo.Account;
import hsf301.hsh.pojo.Car;
import hsf301.hsh.pojo.Customer;

public class CustomerRepository implements ICustomerRepository {
	
	private static CustomerDAO customerDAO = null;

	public CustomerRepository(String persistanceName) {
		if(customerDAO == null) {
			customerDAO = new CustomerDAO(persistanceName);
		}
	}

	@Override
	public List<Customer> findAll() {
		return customerDAO.getCustomers();
	}
	
	@Override
	public void save(Customer customer) {
		customerDAO.save(customer);
	}
	
	@Override
	public void delete(String customerID) {
		customerDAO.delete(customerID);
	}
	
	@Override
	public Customer findById(String customerID) {
		return customerDAO.findById(customerID);
	}
	
	@Override
	public void update(Customer customer) {
		customerDAO.update(customer);
	}
	
	@Override
	public Customer checkLogin(String email, String password) {
		Customer customer = customerDAO.checkLogin(email, password);
		if(customer != null) {
			return customer;
		}
		return null;
	}

	@Override
	public Account getAccountByID(String accountID) {
		// TODO Auto-generated method stub
		return customerDAO.findAccountById(accountID);
	}

}
