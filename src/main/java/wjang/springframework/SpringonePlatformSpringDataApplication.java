package wjang.springframework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import wjang.springframework.domains.Employee;
import wjang.springframework.domains.Manager;
import wjang.springframework.repositories.EmployeeRepository;
import wjang.springframework.repositories.ManagerRepository;

@SpringBootApplication
public class SpringonePlatformSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringonePlatformSpringDataApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initData(EmployeeRepository employeeRepository,
								ManagerRepository managerRepository) {

		return args -> {
			Manager m1 = managerRepository.save(new Manager("Heongdeok Yoon"));
			Manager m2 = managerRepository.save(new Manager("Jayone Yoo"));
			Manager m3 = managerRepository.save(new Manager("Eungsu Yuk"));
			Manager m4 = managerRepository.save(new Manager("Youngmin No"));
			employeeRepository.save(new Employee("Wonjun","Jang","manager", m2) );
			employeeRepository.save(new Employee("Shinkyu","Kim","developer", m4));
			employeeRepository.save(new Employee("Gongsu","Lee","manager", m3));
			employeeRepository.save(new Employee("Kyungtae","Han","pm", m1));
			employeeRepository.save(new Employee("Hanjun","Lee","pm", m1));
		};
	}
}
