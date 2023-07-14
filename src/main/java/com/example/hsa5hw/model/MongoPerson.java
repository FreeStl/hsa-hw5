package com.example.hsa5hw.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
public class MongoPerson {
    private String name;

    public MongoPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
