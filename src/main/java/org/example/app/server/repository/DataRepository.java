package org.example.app.server.repository;

import org.example.app.server.entity.Contact;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<Contact> fetchData() {
        List<Contact> list = new ArrayList<>();
        list.add(new Contact("Tom", "892-543-5523"));
        list.add(new Contact("Alice", "574-453-6689"));
        list.add(new Contact("Veronika", "333-456-4321"));
        return list;
    }
}
