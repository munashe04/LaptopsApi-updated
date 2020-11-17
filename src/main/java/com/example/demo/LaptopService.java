package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class LaptopService {
	
	@Autowired
	private final LaptopDao laptopDao;

	private LaptopService(LaptopDao laptopDao) {
		this.laptopDao = laptopDao;
		
	}
	public int addLaptop(Laptops laptop) {
		return laptopDao.addLaptop(laptop);
	}
	
	public int deleteBySerialNumber(UUID serialNumber) {
		return laptopDao.deleteBySerialNumber(serialNumber);
	}
	
	public List<Laptops>allLaptops(){
		return laptopDao.allLaptops();
	}
	
	public Optional <Laptops>selectBySerialNumber(UUID serialNumber){
		return laptopDao.selectBySerialNumber();
	}
	
	public int updateBySerialNumber(Laptops laptop,UUID serialNumber) {
		return laptopDao.updateBySerialNumber(laptop, serialNumber);
	}

}
