package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
    @NotNull(message = "First name can't be null")
    @Size(min = 2, message = "First name must not be less than 2 characters")
    private String firstName;
    @NotNull(message = "Last name can't be null")
    @Size(min = 2, message = "Last name must not be less than 2 characters")
    private String lastName;
    @NotNull(message = "Password can't be null")
    @Size(min = 8, max = 16, message = "Password must not be less than 8 characters and greater than 16")
    private String password;
    @Email
    @NotNull
    private String email;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
