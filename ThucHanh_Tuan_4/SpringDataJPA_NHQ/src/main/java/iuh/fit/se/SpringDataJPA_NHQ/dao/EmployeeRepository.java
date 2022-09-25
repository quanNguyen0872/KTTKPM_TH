package iuh.fit.se.SpringDataJPA_NHQ.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import iuh.fit.se.SpringDataJPA_NHQ.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	List<Employee> findEmployeeByLastName(String lastName);
}
