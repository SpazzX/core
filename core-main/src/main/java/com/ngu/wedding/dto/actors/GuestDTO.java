package com.ngu.wedding.dto.actors;

public class GuestDTO extends PersonDTO
{
    public GuestDTO(String firstName, String lastName, String id)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDomainUUID(id);
    }

    private String weddingID;
    private int guestCount = 0;

    public String getWeddingID()
    {
        return weddingID;
    }

    public void setWeddingID(String weddingID)
    {
        this.weddingID = weddingID;
    }

    public int getGuestCount()
    {
        return guestCount;
    }

    public void setGuestCount(int guestCount)
    {
        this.guestCount = guestCount;
    }

}
