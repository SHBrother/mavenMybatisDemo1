package com.ma.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.ma.dao.PersonDao;
import com.ma.dao.impl.PersonDaoImpl;
import com.ma.entity.PersonEntity;

public class PersonEntityTest {

private PersonDao personEntityDao;
	
	@Before
	public void before() {
		personEntityDao = new PersonDaoImpl();
	}
	
	@Test
	public void testQueryAll() {
		List<PersonEntity> personList = personEntityDao.queryAll();
		
		for(PersonEntity each : personList) {
			System.out.println(each);
		}
	}
	
	@Test
	public void testInsert() {
		PersonEntity person = new PersonEntity();
		person.setId(21321);
		person.setName("乔巴");
		personEntityDao.insert(person);
	}


}
