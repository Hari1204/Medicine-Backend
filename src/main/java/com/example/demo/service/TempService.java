package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Temp;
import com.example.demo.repository.TempDao;

@Service
@Transactional
public class TempService {
	@Autowired
	private TempDao tempdao;

	public Temp addData(Temp temp) {
		// TODO Auto-generated method stub
		return tempdao.save(temp);
	}

	public List<Temp> viewAll() {
		// TODO Auto-generated method stub
		return tempdao.findAll();
	}

	public void truncateAll() {
		// TODO Auto-generated method stub
		tempdao.deleteAll();
	}

}
