package com.example.springjpaapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpaapi.entity.ChuyenBay;
import com.example.springjpaapi.repository.ChuyenBayRepository;
import com.example.springjpaapi.service.ChuyenBayService;


@RestController
@RequestMapping("/api")
public class ChuyenBayRestController {
	private ChuyenBayService chuyenBayService;
	@Autowired
	public ChuyenBayRestController(ChuyenBayService theChuyenBayService) {
		chuyenBayService=theChuyenBayService;
		// TODO Auto-generated constructor stub
	}
	@PostMapping("/chuyenbays")
	public ChuyenBay addChuyenBay(@RequestBody ChuyenBay chuyenBay) {
		return chuyenBayService.saveChuyenBay(chuyenBay);
	}
	
	@PutMapping("/chuyenbays")
	public ChuyenBay updateChuyenBay(@RequestBody ChuyenBay chuyenBay) {
		return chuyenBayService.updateChuyenBay(chuyenBay);
	}
	
	@GetMapping("/chuyenbays")
	public List<ChuyenBay> getAllCB(){
		return chuyenBayService.getAllCB();
	}
}
	
