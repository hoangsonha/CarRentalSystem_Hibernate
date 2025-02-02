package hsf301.hsh.service;

import java.util.List;
import hsf301.hsh.pojo.Car;
import hsf301.hsh.pojo.CarProducer;
import hsf301.hsh.repository.CarRepository;
import hsf301.hsh.repository.ICarRepository;

public class CarService implements ICarService {
	
	private ICarRepository iCarRepository = null;
	
	public CarService(String fileName) {
		iCarRepository = new CarRepository(fileName);
	}
	
	@Override
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return iCarRepository.findAll();
	}

	@Override
	public void save(Car car) {
		// TODO Auto-generated method stub
		iCarRepository.save(car);
	}

	@Override
	public void delete(String carID) {
		// TODO Auto-generated method stub
		iCarRepository.delete(carID);
	}

	@Override
	public Car findById(String carID) {
		// TODO Auto-generated method stub
		return iCarRepository.findById(carID);
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		iCarRepository.update(car);
	}

	@Override
	public CarProducer findCarProducerById(String producerID) {
		// TODO Auto-generated method stub
		return iCarRepository.findCarProducerById(producerID);
	}

}
