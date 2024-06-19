package com.registration.loginregistrator.repositery;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.registration.loginregistrator.Entitylayer.Register;


@Repository
public interface Repositerylayer extends JpaRepository <Register,Long>  {

	
	 @Query(value="select * from register where user_name=?1 and password=?2",
			 nativeQuery=true
			 		)
	 public Register getbyusernameandpassword(String username, String password);
	
			 	
}