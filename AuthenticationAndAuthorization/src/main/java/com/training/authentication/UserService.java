package com.training.authentication;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.authentication.entity.Role;
import com.training.authentication.entity.User;
import com.training.authentication.entity.UserDto;

@Service
@Transactional
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User registerNewUserAccount(UserDto userDto) throws UserAlreadyExistException {
		if (userExists(userDto.getEmail())) {
			throw new UserAlreadyExistException("There is an account with that email address: " + userDto.getEmail());
		}

		User user = new User();
		user.setFirstname(userDto.getFirstName());
		user.setLastname(userDto.getLastName());
		user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		user.setUsername(userDto.getEmail());
		user.setEnabled(true);
		Set<Role> roles = new HashSet<Role>();
		roles.add(roleRepository.getRoleByRolename("USER"));
		user.setRoles(roles);

		return userRepository.save(user);
	}

	private boolean userExists(String username) {
		return userRepository.getUserByUsername(username) != null;
	}
}