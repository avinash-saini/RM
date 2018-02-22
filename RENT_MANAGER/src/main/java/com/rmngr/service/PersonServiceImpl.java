package com.rmngr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmngr.bean.Person;
import com.rmngr.dao.PersonDao;

@Service("personService")
public class PersonServiceImpl implements PersonService {


	private PersonDao personDao;

	@Autowired
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void addPerson(Person person) {
		personDao.addPerson(person);

	}

	@Override
	public void editPerson(Person person, int personId) {
		personDao.editPerson(person, personId);
	}

	@Override
	public void deletePerson(int personId) {
		personDao.deletePerson(personId);
	}

	@Override
	public Person find(int personId) {
		return personDao.find(personId);
	}

	@Override
	public List < Person > findAll() {
		return personDao.findAll();
	}
}
