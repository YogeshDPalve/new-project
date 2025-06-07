package com.edigest.journalApp.controller;

import com.edigest.journalApp.entity.JournalEntry;
import com.edigest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class journalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping() // Get method


    @PostMapping()  // Post method
    public boolean createEntry(@RequestBody JournalEntry myEntry ){
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping()
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
return null;
    }
}
