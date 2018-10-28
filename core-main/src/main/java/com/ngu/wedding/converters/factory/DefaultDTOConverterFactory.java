package com.ngu.wedding.converters.factory;

import com.ngu.wedding.converters.interfaces.GuestDTOConverter;
import com.ngu.wedding.converters.interfaces.HostDTOConverter;
import com.ngu.wedding.domains.AbstractDomain;
import com.ngu.wedding.domains.actors.Guest;
import com.ngu.wedding.dto.AbstractDTO;
import com.ngu.wedding.dto.actors.GuestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultDTOConverterFactory implements DTOConverterFactory
{

    @Autowired
    private GuestDTOConverter guestDTOConverter;
    @Autowired
    private HostDTOConverter hostDTOConverter;

    @Override
    public AbstractDomain convertFromDTO(AbstractDTO from)
    {
        if(from instanceof GuestDTO)
        {
            return guestDTOConverter.convertFromDTO((GuestDTO)from);
        }
        return null;
    }

    @Override
    public AbstractDTO convertToDTO(AbstractDomain to)
    {
        if(to instanceof Guest)
        {
            return guestDTOConverter.convertToDTO((Guest) to);
        }
        return null;
    }

    public GuestDTOConverter getGuestDTOConverter()
    {
        return guestDTOConverter;
    }

    public void setGuestDTOConverter(GuestDTOConverter guestDTOConverter)
    {
        this.guestDTOConverter = guestDTOConverter;
    }

    public HostDTOConverter getHostDTOConverter()
    {
        return hostDTOConverter;
    }

    public void setHostDTOConverter(HostDTOConverter hostDTOConverter)
    {
        this.hostDTOConverter = hostDTOConverter;
    }
}
