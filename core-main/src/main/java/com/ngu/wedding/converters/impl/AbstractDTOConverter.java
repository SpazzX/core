package com.ngu.wedding.converters.impl;

import com.ngu.wedding.converters.interfaces.DTOConverter;
import com.ngu.wedding.domains.AbstractDomain;
import com.ngu.wedding.dto.AbstractDTO;
import org.springframework.stereotype.Component;

@Component
public class AbstractDTOConverter
{

    public AbstractDomain convertFromDTO(AbstractDTO dto, AbstractDomain domain)
    {
        domain.setActive(dto.isActive());
        domain.setCreatedTime(dto.getCreatedTime());
        domain.setDomainUUID(dto.getDomainUUID());
        domain.setLastModDate(dto.getLastModDate());

        return domain;
    }


    public AbstractDTO convertToDTO(AbstractDomain domain, AbstractDTO dto)
    {
        dto.setActive(domain.isActive());
        dto.setCreatedTime(domain.getCreatedTime());
        dto.setDomainUUID(domain.getDomainUUID());
        dto.setLastModDate(domain.getLastModDate());

        return dto;
    }
}
