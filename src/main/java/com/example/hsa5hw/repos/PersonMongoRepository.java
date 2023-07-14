package com.example.hsa5hw.repos;

import com.example.hsa5hw.model.MongoPerson;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonMongoRepository extends MongoRepository<MongoPerson, String> {
}
