package com.example.login.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.login.model.UserDto;

@RepositoryRestResource(collectionResourceRel="userdto",path="userdto")
public interface UserRepository extends PagingAndSortingRepository<UserDto,Long>{
	List<UserDto> findById(@Param("id") String id);
}


