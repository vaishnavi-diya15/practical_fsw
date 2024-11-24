package Controller;

import Entity.entity;
import Service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/responses")
public class controller {
	 @Autowired
	    private service service;

	    @PostMapping("/add")
	    public entity addOrUpdateResponse(@RequestBody entity userResponse) {
	        return service.saveUserResponse(userResponse);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteResponse(@PathVariable String id) {
	        service.deleteUserResponse(id);
	        System.out.println("Delete successfully!!!");	    }

	    @GetMapping("/show/{id}")
	    public Optional<entity> getResponse(@PathVariable String id) {
	        return service.getUserResponse(id);
	    }
}
