package NamVuEntertainment.TaxiProject.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import NamVuEntertainment.TaxiProject.Domain.Entity.TaxiUser;
import NamVuEntertainment.TaxiProject.Domain.Repository.TaxiUserRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class TestAllFunctionController {
	
	@Autowired
	TaxiUserRepository taxiUserRepository;
	
//	@GetMapping("/fuck")
//	public 
	
	 @PostMapping("/register")
	  public ResponseEntity<TaxiUser> createTutorial(@RequestBody TaxiUser user) {
	    try {
	    	TaxiUser myuser = taxiUserRepository
	          .saveAndFlush(new TaxiUser(user.getUserName(), user.getPassword(), user.getName()));
	    	
	      return new ResponseEntity<>(myuser, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
