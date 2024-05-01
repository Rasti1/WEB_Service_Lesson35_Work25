package org.example.app.server.entity;

public class Contact {

    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact: " + this.getName() +
                ", phone number: " + this.getPhoneNumber() + "\n";
    }
}
