package com.interstate.models;

/**
 * A pojo class for member entity.
 */
public class Member {
    private long memberId;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    public Member() {

    }

    public Member(long memberId,
                  String username,
                  String email,
                  String firstName,
                  String lastName,
                  String password) {
        this.memberId = memberId;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
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

    public String getPassword() {
        return password;
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

    public Member setPassword(String password) {
        this.password = password;
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
                ", password='" + password + '\'' +
                '}';
    }
}
