package com.mamingjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.mamingjie.criteria.UserSearchCriteria;
import com.mamingjie.domain.User;
import com.mamingjie.domain.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public Page<User> findUser(UserSearchCriteria criteria) {
		return userRepository.findAll(criteria.getPredicate(), criteria.getPageable());
	}

	public User findUserById(Long id) {
		return userRepository.findOne(id);
	}
}
