package com.mango.service;

import com.mango.bean.Person;
import com.mango.utils.OAResult;
import com.mango.utils.PageDataView;

public interface PersonService {
	public OAResult insertDataOfPerson(Person person);
	
	public OAResult deleteDataOfPerson(int id);
	
	public Person getPersonById(int id);
	
	public OAResult updateDataOfPerson(Person person);
	
	public PageDataView<Person> getPersons(int currentPage, int pageSize);
}
