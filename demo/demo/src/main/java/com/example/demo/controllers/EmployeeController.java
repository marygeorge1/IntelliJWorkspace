package com.example.demo.controllers;

import com.example.demo.exceptions.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    Logger logger= LoggerFactory.getLogger(EmployeeController.class);

    //List<Employee> employees=new ArrayList<>();

    /*public EmployeeController() {
        Employee emp1=new Employee(1,"Joby");
        Employee emp2=new Employee(2,"Mary");
        employees.add(emp1);
        employees.add(emp2);
    }*/

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*@RequestMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id) throws EmployeeNotFoundException {
        Employee employee=null;
        List<Employee> result=this.employees
                .stream()
                .filter(emp->emp.getId()==id)
                .collect(Collectors.toList());

        if(result.size()>0){
            employee=result.get(0);
            return employee;
        }
        else{
            throw new EmployeeNotFoundException("Employee not Found");
        }
    }*/

    @RequestMapping("/employee/{id}")
    public Employee getTheEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee")
    public void saveTheEmployee(@RequestBody Employee emp){

        logger.info("New employee added on "+ LocalDate.now());
        employeeService.saveEmployee(emp);
    }








}
