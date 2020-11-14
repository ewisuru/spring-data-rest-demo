package com.example.demo.repository;

import com.example.demo.entity.AccountInfo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "accounts", collectionResourceRel = "accounts")
public interface AccountInfoEntityRepository extends PagingAndSortingRepository<AccountInfo, Integer> {
}
