package com.ngu.wedding.dto.actors;

public class GuestDTO extends PersonDTO
{
    public GuestDTO(String firstName, String lastName, String id)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setGuestID(id);
    }

    private String guestID;
    private String weddingID;
    private int guestCount;

    public String getGuestID()
    {
        return guestID;
    }

    public void setGuestID(String guestID)
    {
        this.guestID = guestID;
    }

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
