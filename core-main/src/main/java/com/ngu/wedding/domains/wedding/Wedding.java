package com.ngu.wedding.domains.wedding;

import com.ngu.wedding.domains.AbstractDomain;
import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.domains.actors.Host;
import com.ngu.wedding.domains.location.Address;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

public class Wedding extends AbstractDomain
{
    private String weddingTitle;
    private String weddingLocation;
    @DBRef private List<Host> hosts;
    @DBRef private List<Guest> guests;
    @DBRef private Address receptionVenue;
    @DBRef private Address ceremonyVenue;

    public String getWeddingTitle()
    {
        return weddingTitle;
    }

    public void setWeddingTitle(String weddingTitle)
    {
        this.weddingTitle = weddingTitle;
    }

    public String getWeddingLocation()
    {
        return weddingLocation;
    }

    public void setWeddingLocation(String weddingLocation)
    {
        this.weddingLocation = weddingLocation;
    }

    public List<Host> getHosts()
    {
        return hosts;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public List<Guest> getGuests()
    {
        return guests;
    }

    public void setGuests(List<Guest> guests)
    {
        this.guests = guests;
    }

    public Address getReceptionVenue() {
        return receptionVenue;
    }

    public void setReceptionVenue(Address receptionVenue) {
        this.receptionVenue = receptionVenue;
    }

    public Address getCeremonyVenue() {
        return ceremonyVenue;
    }

    public void setCeremonyVenue(Address ceremonyVenue) {
        this.ceremonyVenue = ceremonyVenue;
    }
}
