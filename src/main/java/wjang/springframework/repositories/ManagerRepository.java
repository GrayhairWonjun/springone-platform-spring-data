package wjang.springframework.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import wjang.springframework.domains.Manager;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, Long> {

	List<Manager> findByEmployeesRoleContainsIgnoreCase(@Param("q") String role);
	List<Manager> findDistinctByEmployeesLastnameContainsIgnoreCase(@Param("q") String lastName);
}
