package app1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app1.model.User;
import app1.repository.*;
@RestController
@RequestMapping("/user")
@CrossOrigin(origins="http://localhost:4200/")
public class usercontroller {
	@Autowired
	private userRepo repository;
	@PostMapping("/login")
	public ResponseEntity<?> logininfo(@RequestBody User userData){
		User user = repository.findByUserId(userData.getusername());
		if(user.getPassword().equals(userData.getPassword()))
			return ResponseEntity.ok(user);
		return (ResponseEntity<?>) ResponseEntity.internalServerError();

}
}