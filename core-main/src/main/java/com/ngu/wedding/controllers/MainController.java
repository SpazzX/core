package com.ngu.wedding.controllers;

import com.ngu.wedding.converters.factory.DTOConverterFactory;
import com.ngu.wedding.repo.interfaces.actors.GuestRepository;
import com.ngu.wedding.repo.interfaces.actors.HostRepository;
import com.ngu.wedding.repo.interfaces.location.AddressRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api")
public class MainController
{
    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);
    private final String HEALTH_CHECK_MSG = "Simple System Status: RUNNING";

    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private HostRepository hostRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private DTOConverterFactory dtoConverterFactory;

    //@Autowired
    //private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping(path = "/health")
    public @ResponseBody String healthCheck()
    {
        LOG.info(LOG + " health check hit.");
        return HEALTH_CHECK_MSG;
    }

    /*@PostMapping("/attend/{name}")
    public void example(@PathVariable String name)
    {
        //B, if you see this, maybe its an event where you accept invite and get push notes?
        //kafkaTemplate.send("guests", "Thanks, Brian: I'd like to attend. My name is " + name);
    }*/

    public GuestRepository getGuestRepository()
    {
        return guestRepository;
    }

    public void setGuestRepository(GuestRepository guestRepository)
    {
        this.guestRepository = guestRepository;
    }

    public HostRepository getHostRepository()
    {
        return hostRepository;
    }

    public void setHostRepository(HostRepository hostRepository)
    {
        this.hostRepository = hostRepository;
    }

    public DTOConverterFactory getDtoConverterFactory() {
        return dtoConverterFactory;
    }

    public void setDtoConverterFactory(DTOConverterFactory dtoConverterFactory) {
        this.dtoConverterFactory = dtoConverterFactory;
    }

    public AddressRepository getAddressRepository() {
        return addressRepository;
    }

    public void setAddressRepository(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
}
