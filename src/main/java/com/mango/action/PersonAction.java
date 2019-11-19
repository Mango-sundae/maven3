package com.mango.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mango.bean.Person;
import com.mango.service.PersonService;
import com.mango.utils.OAResult;
import com.mango.utils.PageDataView;

@Controller
public class PersonAction {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/show")
	public String showPersonData(@RequestParam(value = "currentPage",defaultValue = "1")int currentPage,Model model) {
		
		PageDataView<Person> pageDataView = personService.getPersons(currentPage, 5);
		model.addAttribute("pageDataView", pageDataView);
		
		return "person/list";
	}
	
	@RequestMapping("/addPerson")
	public String addPersonUI() {
		
		return "person/add";
	}
	
	@ResponseBody
	@RequestMapping("/addDataOfPerson")
	public OAResult addInformationOfPerson(Person person) {
		System.out.println(person);
		OAResult oaResult = personService.insertDataOfPerson(person);
		
		return oaResult;
	}
	
	@ResponseBody
	@RequestMapping("/deleteSingle")
	public OAResult deleSingleData(Integer id) {
		
		OAResult oaResult = personService.deleteDataOfPerson(id);
		
		return oaResult;
	}
	
	@RequestMapping("/updateUI")
	public String updateUI(Integer id,Model model) {
		
		Person person = personService.getPersonById(id);
		
		model.addAttribute("person", person);
		
		return "person/update";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public OAResult updateDataOfPerson(Person person) {
		
		OAResult oaResult = personService.updateDataOfPerson(person);
		
		return oaResult;
		
	}
	
}
