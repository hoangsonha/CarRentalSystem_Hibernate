package hsf301.hsh.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import hsf301.hsh.pojo.CarRental;
import hsf301.hsh.pojo.Customer;
import hsf301.hsh.service.CarRentalService;
import hsf301.hsh.service.CustomerService;
import hsf301.hsh.service.ICarRentalService;
import hsf301.hsh.service.ICustomerService;

public class MainController {
	public static void main(String[] args) throws ParseException {
		String file = "hibernate.cfg.xml";
		
		ICarRentalService iCarRentalService = new CarRentalService(file);
		
		
		SimpleDateFormat spm = new SimpleDateFormat("yyyy-MM-dd");
		Date da = spm.parse("2023-03-03");
		Date date = spm.parse("2024-12-12");
		
		List<CarRental> cars = iCarRentalService.getAllBySearch(da, date);
		
		
		System.out.println("Hello : " + cars.size());
	}
}
