package com.ngu.wedding.repo.interfaces.location;

import com.ngu.wedding.domains.location.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String>
{
}
