package xyz.brunocabete.course.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.brunocabete.course.entities.User;
import xyz.brunocabete.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) throws NoSuchElementException {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
