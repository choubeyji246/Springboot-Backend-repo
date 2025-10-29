package com.backend.backend.controller;

import com.backend.backend.entity.BackendEntry;
import com.backend.backend.service.BackendEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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
    public BackendEntry getEntryById(@PathVariable ObjectId myId){
        return backendEntryService.getById(myId);
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