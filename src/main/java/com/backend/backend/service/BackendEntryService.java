package com.backend.backend.service;

import com.backend.backend.entity.BackendEntry;
import com.backend.backend.repository.BackendEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BackendEntryService {
    @Autowired
    private BackendEntryRepository backendEntryRepository;

    public void saveEntry(BackendEntry backendEntry){
        backendEntryRepository.save(backendEntry);
    }

    public List<BackendEntry> getAll(){
        return backendEntryRepository.findAll();
    }

    public BackendEntry getById(ObjectId id){
        return backendEntryRepository.findById(id).orElse(null);
    }

    public void deleteById(ObjectId id){
        backendEntryRepository.deleteById(id);
    }
}
