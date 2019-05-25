package com.taxiagency.domain;

public class Driver implements Entity{

    private String id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public String toString() {
        return "id='" + id + ", name='" + name;
    }
}
