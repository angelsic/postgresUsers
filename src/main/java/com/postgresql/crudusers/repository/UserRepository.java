package com.postgresql.crudusers.repository;

import com.postgresql.crudusers.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}

