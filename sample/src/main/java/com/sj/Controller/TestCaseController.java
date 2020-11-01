package com.sj.Controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.sj.Model.TestCase;
import com.sj.service.TestCaseService;  


@RestController  
public class TestCaseController   
{  

@Autowired  
TestCaseService Service;  

@GetMapping("/test")  
private List<TestCase> getAllTestCases()   
{  
return Service.getAllTestCases();  
}   
@GetMapping("/test/{id}")  
private TestCase getTestCases(@PathVariable("id") int id)   
{  
return Service.getTestCaseById(id);  
}  

@DeleteMapping("/test/{id}")  
private void deleteTestCase(@PathVariable("id") int id)   
{  
	Service.delete(id);  
}   
@PostMapping("/test")  
private int saveTestCase(@RequestBody TestCase t)   
{  
Service.saveOrUpdate(t);  
return t.getId();  
}  
 
@PutMapping("/test")  
private TestCase update(@RequestBody TestCase testcase)   
{  
Service.saveOrUpdate(testcase);  
return testcase;  
}  
@PutMapping("/insert")
public TestCase insertTestCase(@RequestBody TestCase t)
{
	return Service.createTestCase(t);
}
}  
