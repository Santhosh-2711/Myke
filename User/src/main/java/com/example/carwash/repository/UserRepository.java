package com.example.carwash.repository;

import com.example.carwash.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value="select * from users where username like :username",nativeQuery=true)
	  User findByUsername(String username);
	


}
