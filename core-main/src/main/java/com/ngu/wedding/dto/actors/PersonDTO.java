package com.ngu.wedding.dto.actors;

import com.ngu.wedding.dto.AbstractDTO;
import com.ngu.wedding.dto.location.AddressDTO;

import java.util.List;

public abstract class PersonDTO extends AbstractDTO
{
    private String firstName;
    private String lastName;
    private List<AddressDTO> addresses;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }
}
