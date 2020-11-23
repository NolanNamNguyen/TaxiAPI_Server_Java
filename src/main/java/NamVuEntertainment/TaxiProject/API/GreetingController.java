package NamVuEntertainment.TaxiProject.API;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import NamVuEntertainment.TaxiProject.Domain.DTO.Greeting;
import NamVuEntertainment.TaxiProject.Domain.Entity.TaxiUser;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class GreetingController {
	
	private List<TaxiUser> employees = createList();

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	@RequestMapping(value = "/empls123oyees", method = RequestMethod.GET, produces = "application/json")
	public String hellothere() {
		return "ok lah this is fucking ez";
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
	public List<TaxiUser> firstPage() {
		return employees;
	}
	
	private static List<TaxiUser> createList() {
		List<TaxiUser> tempEmployees = new ArrayList<>();
		TaxiUser emp1 = new TaxiUser();
		emp1.setName("emp1");
//		emp1.setEmail("manager@gmail.com");
//		emp1.setPhone("1123212345");

		TaxiUser emp2 = new TaxiUser();
		emp2.setName("emp2");
//		emp1.setEmail("managerasd234@gmail.com");
//		emp1.setPhone("999999");
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}
}
