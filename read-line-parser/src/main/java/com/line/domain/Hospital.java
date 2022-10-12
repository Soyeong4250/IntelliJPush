package com.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private String emergencyRoom;  // Java는 camel, Python은 snake
    private String name;
    private String subdivision;

    public Hospital(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
