package com.madhu.MVCTelusko.Repository;

import org.springframework.data.repository.CrudRepository;

import com.madhu.MVCTelusko.Entity.AddEntity;

public interface MyRepository extends CrudRepository<AddEntity,Integer> {

}
