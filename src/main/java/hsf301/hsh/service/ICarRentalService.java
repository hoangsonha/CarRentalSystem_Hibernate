package hsf301.hsh.service;

import java.util.Date;
import java.util.List;
import hsf301.hsh.pojo.Car;
import hsf301.hsh.pojo.CarRental;
import hsf301.hsh.pojo.Review;

public interface ICarRentalService {
	public List<CarRental> findAll();
	public List<Review> findAllReviews();
	public void save(CarRental carRental);
	public void delete(int carRentalID);
	public CarRental findById(int carRentalID);
	public void update(CarRental carRental);
	public List<CarRental> getAllBySearch(Date startDate, Date endDate);
	public List<CarRental> getAllBySearchCustomerID(Date startDate, Date endDate, String customerID);
	public List<CarRental> getAllBySearchCustomerIDAll(String customerID);
	public List<Review> getReviewUser(String customerID);
}
