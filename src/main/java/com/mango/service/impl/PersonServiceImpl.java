package com.mango.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mango.bean.Person;
import com.mango.bean.PersonExample;
import com.mango.mapper.PersonMapper;
import com.mango.service.PersonService;
import com.mango.utils.OAResult;
import com.mango.utils.PageDataView;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public OAResult insertDataOfPerson(Person person) {
		
		System.out.println("service"+person);
		int rows = personMapper.insert(person);
		System.out.println(rows);
		if (rows==1) {
			return OAResult.build(200, "��ӳɹ�");
		}
		
		return OAResult.build(400, "���ʧ��");
	}

	@Override
	public OAResult deleteDataOfPerson(int id) {
		
		
		int rows = personMapper.deleteByPrimaryKey(id);
		
		if (rows==1) {
			return OAResult.build(200, "ɾ���ɹ�");
		}
		
		return OAResult.build(400, "ɾ��ʧ��");
	}

	@Override
	public Person getPersonById(int id) {
		
		Person person = personMapper.selectByPrimaryKey(id);
		
		return person;
	}

	@Override
	public OAResult updateDataOfPerson(Person person) {
		
		int rows = personMapper.updateByPrimaryKey(person);
		
		if (rows==1) {
			return OAResult.build(200, "�޸ĳɹ�");
		}
		
		return OAResult.build(400, "�޸�ʧ��");
	}

	@Override
	public PageDataView<Person> getPersons(int currentPage, int pageSize) {
		
		PageDataView<Person> pageDataView = new PageDataView<Person>();
		pageDataView.setCurrentPage(currentPage);
		pageDataView.setPageSize(pageSize);
		
		PageHelper.startPage(currentPage, pageSize);
		
		PersonExample personExample = new PersonExample();
		
		List<Person> list = personMapper.selectByExample(personExample);
		
		PageInfo<Person> pageInfo = new PageInfo<Person>(list);
		
		pageDataView.setTotalDatas(pageInfo.getTotal());
		
		pageDataView.setDataList(pageInfo.getList());
		
		
		return pageDataView;
	}

}
