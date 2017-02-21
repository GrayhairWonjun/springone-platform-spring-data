package wjang.springframework.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wjang.springframework.domains.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	List<Employee> findByLastname(@Param("q") String lastName);
	List<Employee> findByRole(@Param("q") String role);
}
