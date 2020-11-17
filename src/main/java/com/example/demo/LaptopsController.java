package com.example.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/laptops")

@RestController
public class LaptopsController {
	
	private LaptopService laptopService;
	
	public LaptopsController(LaptopService laptopService) {
		this.laptopService = laptopService;
	}
	
	@PostMapping
	public void addLaptop(@RequestBody Laptops laptop) {
		laptopService.addLaptop(laptop);
		
	}
	@GetMapping
	public List<Laptops>allLaptops(){
		return laptopService.allLaptops();
		
	}
	@GetMapping(path = "{serialNumber}")
	public Laptops getBySerialNumber(@PathVariable("serialNumber") UUID serialNumber) {
		return laptopService.selectBySerialNumber(serialNumber).orElse(null);
	}
	
	@DeleteMapping(path = "{serialNumber}" )
	public void deleteBySerialNumber(@PathVariable("serialNumber") UUID serialNumber) {
		 laptopService.deleteBySerialNumber(serialNumber);
	}
	
	@PutMapping(path = "{serialNumber}")
	public void updateBySerialNumber(@PathVariable("serialNumber") UUID serialNumber,Laptops laptop) {
		laptopService.updateBySerialNumber(laptop, serialNumber);
	}
	
	
	

}
