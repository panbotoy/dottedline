package com.interstate.models;

/**
 * Created by bopan on 7/23/17.
 */
public class Member {
    private long memberId;
    private String username;
    private String email;
    private String firstName;
    private String lastName;

    public Member() {

    }

    public Member(long memberId, String username, String email, String firstName, String lastName) {
        this.memberId = memberId;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getMemberId() {
        return memberId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Member setMemberId(long memberId) {
        this.memberId = memberId;
        return this;
    }

    public Member setUsername(String username) {
        this.username = username;
        return this;
    }

    public Member setEmail(String email) {
        this.email = email;
        return this;
    }

    public Member setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Member setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
