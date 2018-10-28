package com.ngu.wedding.domains.actors;

import com.ngu.wedding.domains.AbstractDomain;
import com.ngu.wedding.domains.location.Address;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public abstract class Person extends AbstractDomain
{
    private String firstName;
    private String lastName;
    @DBRef private List<Address> addresses;


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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
