package com.ngu.wedding.domains;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.util.Date;

/**
 * @author modo
 * Used to store common properties amongst domain objects
 */
public class AbstractDomain implements Serializable
{
    private static final long serialVersionUID = 4865903039190150223L;
    @Id
    private String domainUUID;
    @CreatedDate
    private Date createdTime;
    @LastModifiedDate
    private Date lastModDate;
    private boolean active = true;

    public String getDomainUUID() {
        return domainUUID;
    }

    public void setDomainUUID(String domainUUID) {
        this.domainUUID = domainUUID;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
}
