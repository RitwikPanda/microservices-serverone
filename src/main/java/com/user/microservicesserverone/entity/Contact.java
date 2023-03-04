package com.user.microservicesserverone.entity;

public class Contact {

    private long contactId;
    private String email;
    private String name;
    private long userId;

    public Contact(long contactId, String email, String name, long userId) {
        this.contactId = contactId;
        this.email = email;
        this.name = name;
        this.userId = userId;
    }

    public long getContactId() {
        return contactId;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Contact() {
    }
}
