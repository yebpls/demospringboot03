package com.cybersoft.demospringboot03.repository;

import com.cybersoft.demospringboot03.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Integer> {

}