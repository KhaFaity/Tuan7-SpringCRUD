package com.example.springjpaapi.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChuyenBay;

@Service
public interface ChuyenBayService {


	ChuyenBay saveChuyenBay(ChuyenBay chuyenbay);
	ChuyenBay updateChuyenBay(ChuyenBay chuyenbay);
	List<ChuyenBay> getAllCB();
	ChuyenBay getIdCB(long id);

}
