package com.ngu.wedding.repo.interfaces.actors;

import java.util.List;

import com.ngu.wedding.domains.actors.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GuestRepository extends MongoRepository<Guest, String>
{
	List<Guest> findByLastName(String lastName);
}