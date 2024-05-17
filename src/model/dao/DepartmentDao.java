package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department deparment);
	void update(Department deparment);	
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();	
}
