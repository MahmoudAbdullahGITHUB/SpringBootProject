package com.hr.controller;

import com.hr.model.Employee;
import com.hr.services.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeesController {

    @Autowired
    EmployeesService employeesService;

    @GetMapping("/departments/{deptId}/employees")
    public List<Employee> getAllEmployees(@PathVariable long deptId) {
        return employeesService.getDeptEmps(deptId);
    }


    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeesService.getAllEmployees();
    }

    @GetMapping("/employeeId/{id}")
    public Employee getEmpById(@PathVariable long id) {
        return employeesService.getEmployee(id);
    }

    @GetMapping("/employeeByFirstName")
    public List<Employee> getEmpByFirstName(@RequestParam String firstName) {
        return employeesService.getEmpByFirstName(firstName);
    }

    @GetMapping("/empSearch")
    public List<Employee> empSearch(@RequestParam String firstName, @RequestParam String lastName) {
        return employeesService.getEmpSearch(firstName, lastName);
    }

    @PostMapping("/employees")
    public String addEmp(@RequestBody Employee employee) {
        employeesService.addEmp(employee);
        return "Added Successfully";
    }

    @PutMapping("/employees")
    public String updateEmp(@RequestBody Employee employee) {
        employeesService.updateEmp(employee);
        return "Updated Successfully";
    }

    @DeleteMapping("/employees")
    public String deleteEmp(@RequestParam long id) {
        employeesService.deleteEmp(id);
        return "Deleted Successfully";
    }


}
