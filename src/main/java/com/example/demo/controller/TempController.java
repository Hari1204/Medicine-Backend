package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Temp;
import com.example.demo.service.TempService;

@RestController
public class TempController {

	@Autowired
	private TempService tempservice;
	@CrossOrigin(origins="http://localhost:4200/")
	@PostMapping("Temp/saveTemp")
	public Temp saveTemp(@RequestBody Temp temp) {
		return tempservice.addData(temp);
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@GetMapping("Temp/getData")
	public List<Temp> getData(){
		return tempservice.viewAll();
	}
	@CrossOrigin(origins="http://localhost:4200/")
	@DeleteMapping("Temp/deleteAll")
	public void deleteAll() {
		tempservice.truncateAll();
		
	}

}
