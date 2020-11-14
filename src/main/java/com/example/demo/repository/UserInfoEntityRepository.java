package com.example.demo.repository;

import com.example.demo.entity.UserInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserInfoEntityRepository extends PagingAndSortingRepository<UserInfo, Integer> {
}
