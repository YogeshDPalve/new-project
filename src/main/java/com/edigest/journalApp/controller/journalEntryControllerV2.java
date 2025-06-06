package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryControllerV2 {

    @GetMapping("/get") // Get method
    public List<JournalEntry> getAll(){
            return null;
    }

    @PostMapping("/post")  // Post method
    public boolean createEntry(@RequestBody JournalEntry myEntry ){
        return  false;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
return null;
    }
}
