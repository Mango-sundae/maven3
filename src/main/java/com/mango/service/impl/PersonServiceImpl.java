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
			return OAResult.build(200, "添加成功");
		}
		
		return OAResult.build(400, "添加失败");
	}

	@Override
	public OAResult deleteDataOfPerson(int id) {
		
		
		int rows = personMapper.deleteByPrimaryKey(id);
		
		if (rows==1) {
			return OAResult.build(200, "删除成功");
		}
		
		return OAResult.build(400, "删除失败");
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
			return OAResult.build(200, "修改成功");
		}
		
		return OAResult.build(400, "修改失败");
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
