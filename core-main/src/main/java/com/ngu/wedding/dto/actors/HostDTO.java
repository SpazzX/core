package com.ngu.wedding.dto.actors;


public class HostDTO extends PersonDTO
{
    public HostDTO(String firstName, String lastName, String id)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setHostID(id);
    }

    private String hostID;

    public String getHostID()
    {
        return hostID;
    }

    public void setHostID(String hostID)
    {
        this.hostID = hostID;
    }
}
