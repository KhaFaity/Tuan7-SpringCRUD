package com.example.springjpaapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpaapi.entity.ChuyenBay;
import com.example.springjpaapi.repository.ChuyenBayRepository;
@Service
@Transactional
public class ChuyenBayServiceImpl implements ChuyenBayService {
	private ChuyenBayRepository chuyenBayRepository;

	@Autowired
	public ChuyenBayServiceImpl(ChuyenBayRepository theChuyenBayRepository) {
		chuyenBayRepository=theChuyenBayRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public ChuyenBay saveChuyenBay(ChuyenBay chuyenbay) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.save(chuyenbay);
	}

	@Override
	public ChuyenBay updateChuyenBay(ChuyenBay chuyenbay) {
		// TODO Auto-generated method stub
		return chuyenBayRepository.save(chuyenbay);
	}

	@Override
	public List<ChuyenBay> getAllCB() {
		// TODO Auto-generated method stub
		return chuyenBayRepository.findAll();
	}

	@Override
	public ChuyenBay getIdCB(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

	

}
