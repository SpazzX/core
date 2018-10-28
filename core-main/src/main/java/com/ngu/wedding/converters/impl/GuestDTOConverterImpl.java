package com.ngu.wedding.converters.impl;

import com.ngu.wedding.converters.interfaces.AddressDTOConverter;
import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.domains.location.Address;
import com.ngu.wedding.dto.actors.GuestDTO;
import com.ngu.wedding.converters.interfaces.GuestDTOConverter;
import com.ngu.wedding.dto.location.AddressDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;

@Component
public class GuestDTOConverterImpl implements GuestDTOConverter
{

    @Autowired
    private AbstractDTOConverter abstractDTOConverter;

    @Autowired
    private AddressDTOConverter addressDTOConverter;

    @Override
    public Guest convertFromDTO(GuestDTO dto)
    {
        Guest guest = new Guest(dto.getFirstName(), dto.getLastName());

        guest = (Guest) abstractDTOConverter.convertFromDTO(dto, guest);
        guest.setGuestCount(dto.getGuestCount());

        if(!CollectionUtils.isEmpty(dto.getAddresses()))
        {
            guest.setAddresses(new ArrayList<>());
            for(AddressDTO addressDTO : dto.getAddresses())
            {
                guest.getAddresses().add(addressDTOConverter.convertFromDTO(addressDTO));
            }
        }

        return guest;
    }

    @Override
    public GuestDTO convertToDTO(Guest to)
    {
        GuestDTO dto = new GuestDTO(to.getFirstName(), to.getLastName(), to.getDomainUUID());

        if(!CollectionUtils.isEmpty(to.getAddresses()))
        {
            dto.setAddresses(new ArrayList<>());
            for(Address address : to.getAddresses())
            {
                dto.getAddresses().add(addressDTOConverter.convertToDTO(address));
            }
        }

        return new GuestDTO(to.getFirstName(), to.getLastName(), to.getDomainUUID());
    }


    public AbstractDTOConverter getAbstractDTOConverter() {
        return abstractDTOConverter;
    }

    public void setAbstractDTOConverter(AbstractDTOConverter abstractDTOConverter) {
        this.abstractDTOConverter = abstractDTOConverter;
    }

    public AddressDTOConverter getAddressDTOConverter() {
        return addressDTOConverter;
    }

    public void setAddressDTOConverter(AddressDTOConverter addressDTOConverter) {
        this.addressDTOConverter = addressDTOConverter;
    }
}
