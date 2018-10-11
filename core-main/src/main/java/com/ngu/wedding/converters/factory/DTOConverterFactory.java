package com.ngu.wedding.converters.factory;

import com.ngu.wedding.converters.interfaces.DTOConverter;
import com.ngu.wedding.domains.AbstractDomain;
import com.ngu.wedding.dto.AbstractDTO;

public interface DTOConverterFactory extends DTOConverter<AbstractDomain, AbstractDTO>
{

}
