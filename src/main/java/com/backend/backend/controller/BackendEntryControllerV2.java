package com.backend.backend.controller;

import com.backend.backend.entity.BackendEntry;
import com.backend.backend.service.BackendEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/backend")
public class BackendEntryControllerV2 {

    @Autowired
    private BackendEntryService backendEntryService;

    @GetMapping
    public List<BackendEntry> getAll(){
        return backendEntryService.getAll();
    }

    @PostMapping
    public BackendEntry createEntry(@RequestBody BackendEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        backendEntryService.saveEntry(myEntry);
        return myEntry;
    }

    @GetMapping("/id/{myId}")
    public ResponseEntity<BackendEntry> getEntryById(@PathVariable ObjectId myId){
        BackendEntry backendEntry = backendEntryService.getById(myId);
        if(backendEntry != null){
            return new ResponseEntity<>(backendEntry, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/id/{myId}")
    public BackendEntry updateEntryById(@PathVariable ObjectId myId, @RequestBody BackendEntry myEntry){
//        myEntry.setDate(LocalDateTime.now());
        BackendEntry old = backendEntryService.getById(myId);
        if(old != null){
            old.setTitle(myEntry.getTitle() != null && !myEntry.getTitle().equals("") ? myEntry.getTitle() : old.getTitle());
            old.setContent(myEntry.getContent() != null && !myEntry.getContent().equals("") ? myEntry.getContent() : old.getContent());
        }
        backendEntryService.saveEntry(old);
        return old;
    }

    @DeleteMapping("/id/{myId}")
    public boolean deleteEntryById(@PathVariable ObjectId myId){
        backendEntryService.deleteById(myId);
        return true;
    }

}