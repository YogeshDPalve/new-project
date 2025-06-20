package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journals")
public class journalEntryController {
    private Map<Long,JournalEntry> journalEntries = new HashMap();
    @GetMapping("/get") // Get method
    public List<JournalEntry> getAll(){
            return new ArrayList<>( journalEntries.values());
    }

    @PostMapping("/post")  // Post method
    public boolean createEntry(@RequestBody JournalEntry myEntry ){
//        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }
}
