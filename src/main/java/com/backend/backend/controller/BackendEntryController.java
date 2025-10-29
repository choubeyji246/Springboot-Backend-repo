//package com.backend.backend.controller;
//
//import org.springframework.web.bind.annotation.*;
//
//
//import com.backend.backend.entity.BackendEntry;
//import java.util.*;
//
//@RestController
//@RequestMapping("/_backend")
//public class BackendEntryController {
//
//    private Map<Long, BackendEntry> backendEntries = new HashMap<>();
//
//    @GetMapping
//    public List<BackendEntry> getAll(){
//        return new ArrayList<>(backendEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody BackendEntry myEntry){
//        backendEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("/id/{myId}")
//    public BackendEntry getEntryById(@PathVariable Long myId){
//        return backendEntries.get(myId);
//    }
//
//    @PutMapping("/id/{myId}")
//    public boolean updateEntryById(@PathVariable Long myId, @RequestBody BackendEntry myEntry){
//        backendEntries.put(myId, myEntry);
//        return true;
//    }
//
//    @DeleteMapping("/id/{myId}")
//    public boolean deleteEntryById(@PathVariable Long myId){
//        backendEntries.remove(myId);
//        return true;
//    }
//
//}