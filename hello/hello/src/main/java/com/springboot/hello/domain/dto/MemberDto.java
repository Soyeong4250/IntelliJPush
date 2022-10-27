package com.springboot.hello.domain.dto;

public class MemberDto {
    private String name;
    private String email;
    private String organization;
    private int age;

    public MemberDto(String name, String email, String organization, int age) {
        this.name = name;
        this.email = email;
        this.organization = organization;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", this.name, this.email, this.organization, this.age);
    }
}
