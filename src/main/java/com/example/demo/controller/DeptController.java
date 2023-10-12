package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DeptService;

@RestController
public class DeptController {

	
	private DeptService deptService;

	@Autowired
	public DeptController(DeptService deptService) {
		this.deptService = deptService;
	}
	
	@PostMapping("/department-service")
	public Department saveDept(@RequestBody Department department) {
		Department dept = deptService.saveDept(department);
		return dept;
	}
	
	@GetMapping("/department-service")
	public List<Department> getAllDept(){
		List<Department> deptList = deptService.getAllDept();
		return deptList;
	}
	
}
