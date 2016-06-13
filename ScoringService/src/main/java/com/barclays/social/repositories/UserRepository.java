package com.barclays.social.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barclays.social.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	User findById(String Id);
}
