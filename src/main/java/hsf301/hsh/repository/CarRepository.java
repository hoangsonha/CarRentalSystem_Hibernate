package hsf301.hsh.repository;

import java.util.List;

import hsf301.hsh.dao.CarDAO;
import hsf301.hsh.pojo.Car;
import hsf301.hsh.pojo.CarProducer;

public class CarRepository implements ICarRepository {
	
	private static CarDAO carDAO = null;

	public CarRepository(String persistanceName) {
		if(carDAO == null) {
			carDAO = new CarDAO(persistanceName);
		}
	}

	@Override
	public List<Car> findAll() {
		return carDAO.getCars();
	}
	
	@Override
	public void save(Car car) {
		carDAO.save(car);
	}
	
	@Override
	public void delete(String carID) {
		carDAO.delete(carID);
	}
	
	@Override
	public Car findById(String carID) {
		return carDAO.findById(carID);
	}
	
	@Override
	public void update(Car car) {
		carDAO.update(car);
	}

	@Override
	public CarProducer findCarProducerById(String producerID) {
		// TODO Auto-generated method stub
		return carDAO.findProducerById(producerID);
	}

}
