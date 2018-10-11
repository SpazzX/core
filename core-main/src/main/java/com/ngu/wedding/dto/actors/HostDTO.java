package com.ngu.wedding.dto.actors;


public class HostDTO extends PersonDTO
{
    public HostDTO(String firstName, String lastName, String id)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDomainUUID(id);
    }

}
