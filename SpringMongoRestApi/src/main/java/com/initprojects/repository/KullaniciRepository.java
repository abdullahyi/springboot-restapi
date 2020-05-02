package com.initprojects.repository;

import com.initprojects.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici,String> {

}
