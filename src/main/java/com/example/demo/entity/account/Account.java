package com.example.demo.entity.account;

import com.example.demo.entity.timestamp.WithTimestampEntity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "accounts")
public class Account extends WithTimestampEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "varchar(64")
    private String rowGuid = UUID.randomUUID().toString();
    @Column
    private String username;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String password;
    @Column
    private String address;
    @Column
    private boolean isPhoneConfirmed;
    @Column
    private boolean isEmailConfirmed;
    @Column(columnDefinition = "tinyint")
    private int status = AccountStatus.ACTIVE.ordinal();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(String rowGuid) {
        this.rowGuid = rowGuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPhoneConfirmed() {
        return isPhoneConfirmed;
    }

    public void setPhoneConfirmed(boolean phoneConfirmed) {
        isPhoneConfirmed = phoneConfirmed;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    public void setEmailConfirmed(boolean emailConfirmed) {
        isEmailConfirmed = emailConfirmed;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

