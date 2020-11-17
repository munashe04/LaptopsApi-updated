package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
public interface LaptopDao {
	
	int insertLaptop(UUID serialNumber,Laptops laptop);
	
	default int addLaptop(Laptops laptop ) {
		UUID serialNumber = UUID.randomUUID();
		return insertLaptop(serialNumber,laptop);
	}
	
	List<Laptops> allLaptops();
	
	Optional<Laptops>selectBySerialNumber();
	
	int deleteBySerialNumber(UUID serialNumber);
	
	int updateBySerialNumber(Laptops laptop,UUID serialNumber);
	
		
	

}
