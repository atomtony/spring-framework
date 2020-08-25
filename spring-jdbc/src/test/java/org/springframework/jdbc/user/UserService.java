package org.springframework.jdbc.user;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
public interface UserService {

	void save(User user);

	List<User> getUsers();

	User queryForObject();
}
