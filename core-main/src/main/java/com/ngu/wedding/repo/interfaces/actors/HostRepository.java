package com.ngu.wedding.repo.interfaces.actors;

import com.ngu.wedding.domains.actors.Host;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HostRepository extends MongoRepository<Host, String>
{
	List<Host> findByLastName(String lastName);
}