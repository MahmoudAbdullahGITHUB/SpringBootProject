package com.hr.repositories;

import com.hr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findByFirstNameIgnoreCase(String firstName);

    @Query("select emp from Employee emp where emp.firstName = :firstNameBind and emp.lastName = :lastNameBind")
    public List<Employee> empSearch(@Param("firstNameBind") String firstName, @Param("lastNameBind") String lastName);

    public List<Employee> findByDepartmentId(long departmentId);

}
