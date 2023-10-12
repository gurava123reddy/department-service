package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DeptRepository;

@Service
public class DeptServiceImpl implements DeptService {
	
	private DeptRepository deptRepository;
	
	@Autowired
	public DeptServiceImpl(DeptRepository deptRepository) {
		super();
		this.deptRepository = deptRepository;
	}

	@Override
	public List<Department> getAllDept() {
		return deptRepository.findAll();
	}

	@Override
	public Department saveDept(Department department) {
		return deptRepository.save(department);
	}
	
	

}
