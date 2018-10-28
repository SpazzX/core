package com.ngu.wedding.converters.impl;

import com.ngu.wedding.converters.interfaces.AddressDTOConverter;
import com.ngu.wedding.domains.location.Address;
import com.ngu.wedding.dto.location.AddressDTO;
import org.springframework.stereotype.Component;

@Component
public class AddressDTOConverterImpl implements AddressDTOConverter
{
    @Override
    public Address convertFromDTO(AddressDTO dto)
    {
        Address address = new Address();
        address.setCity(dto.getCity());
        address.setLine1(dto.getLine1());
        address.setLine2(dto.getLine2());
        address.setState(dto.getState());
        address.setZip(dto.getZip());

        return address;
    }

    @Override
    public AddressDTO convertToDTO(Address address)
    {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCity(address.getCity());
        addressDTO.setLine1(address.getLine1());
        addressDTO.setLine2(address.getLine2());
        addressDTO.setState(address.getState());
        addressDTO.setZip(address.getZip());

        return addressDTO;
    }
}
