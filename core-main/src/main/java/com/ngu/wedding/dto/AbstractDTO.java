package com.ngu.wedding.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author modo
 * Abstract DTO to store common properties amongst DTOs
 */
public class AbstractDTO implements Serializable
{
    private static final long serialVersionUID = 4865903039190150223L;
    private String domainUUID;
    private Date createdTime;
    private Date lastModDate;
    private boolean active;

    public String getDomainUUID() {
        return domainUUID;
    }

    public void setDomainUUID(String domainUUID) {
        this.domainUUID = domainUUID;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getLastModDate() {
        return lastModDate;
    }

    public void setLastModDate(Date lastModDate) {
        this.lastModDate = lastModDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
