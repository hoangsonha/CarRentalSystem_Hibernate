package hsf301.hsh.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CARPRODUCERS")
public class CarProducer {
	@Id
	@Column(nullable = false)
	private String producerID;
	@Column(nullable = false)
	private String procuderName;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String country;
	@OneToMany(mappedBy = "producerID")
	private Set<Car> setCars = new HashSet<>();
	public String getProducerID() {
		return producerID;
	}
	public void setProducerID(String producerID) {
		this.producerID = producerID;
	}
	public String getProcuderName() {
		return procuderName;
	}
	public void setProcuderName(String procuderName) {
		this.procuderName = procuderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Set<Car> getSetCars() {
		return setCars;
	}
	public void setSetCars(Set<Car> setCars) {
		this.setCars = setCars;
	}
	public CarProducer(String producerID, String procuderName, String address, String country, Set<Car> setCars) {
		super();
		this.producerID = producerID;
		this.procuderName = procuderName;
		this.address = address;
		this.country = country;
		this.setCars = setCars;
	}
	public CarProducer() {
		super();
	}
	
	
}
