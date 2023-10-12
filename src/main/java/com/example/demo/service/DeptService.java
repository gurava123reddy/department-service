package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DeptService {

	public List<Department> getAllDept();

	public Department saveDept(Department department);

}
