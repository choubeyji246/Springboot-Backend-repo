package com.backend.backend.repository;

import com.backend.backend.entity.BackendEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface BackendEntryRepository extends MongoRepository<BackendEntry, ObjectId> {

}
