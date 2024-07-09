package hsf301.hsh.repository;

import java.util.List;

import hsf301.hsh.pojo.Account;
import hsf301.hsh.pojo.Car;
import hsf301.hsh.pojo.Customer;

public interface ICustomerRepository {
	public List<Customer> findAll();
	public void save(Customer customer);
	public void delete(String customerID);
	public Customer findById(String customerID);
	public void update(Customer customer);
	public Customer checkLogin(String email, String password);
	public Account getAccountByID(String accountID);
}
