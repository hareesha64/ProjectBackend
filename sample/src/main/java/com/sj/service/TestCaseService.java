package com.sj.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.sj.Model.TestCase;
import com.sj.Repository.TestCaseRepository;


//defining the business logic  
@Service  
public class TestCaseService   
{  
@Autowired  
TestCaseRepository Repository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<TestCase> getAllTestCases()   
{  
List<TestCase> testcase = new ArrayList<TestCase>();  
Repository.findAll().forEach(testcase1 -> testcase.add(testcase1));  
return testcase;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public TestCase getTestCaseById(int id)   
{  
return Repository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(TestCase books)   
{  
	Repository.save(books);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
	Repository.deleteById(id);  
}  
//updating a record  
public void update(TestCase t, int id)   
{  
Repository.save(t);  
}  
public TestCase createTestCase(TestCase testCase)
{
	return Repository.save(testCase);
}
}  
