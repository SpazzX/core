package com.ngu.wedding.domains.table;

import java.util.Set;

import com.ngu.wedding.domains.AbstractDomain;
import com.ngu.wedding.domains.wedding.Wedding;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.ngu.wedding.domains.actors.Person;


public class Table extends AbstractDomain
{
	@DBRef private Wedding wedding;
	@DBRef private Set<Person> people;

	public Table()
	{

	}

	public Table(Set<Person> people)
	{
		setPeople(people);
	}

	public Wedding getWedding() {
		return wedding;
	}

	public Set<Person> getPeople()
	{
		return people;
	}

	public void setPeople(Set<Person> people)
	{
		this.people = people;
	}
}
