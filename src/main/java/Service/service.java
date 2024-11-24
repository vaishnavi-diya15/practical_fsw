package Service;

import Entity.entity;
import Repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class service {

	    @Autowired
	    private repository repository;

	    // Insert or update user response
	    public entity saveUserResponse(entity userResponse) {
	    	System.out.println("Added successfully!!!");
	        return repository.save(userResponse);
	    }

	    // Delete user response by ID
	    public void deleteUserResponse(String id) {
	        repository.deleteById(id);
	    }

	    // Find user response by ID
	    public Optional<entity> getUserResponse(String id) {
	        return repository.findById(id);
	    }
	}

