package com.edigest.journalApp.repository;

import com.edigest.journalApp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {


}
