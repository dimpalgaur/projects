package com.TeacherManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TeacherManagement.model.TeacherAvailability;
import com.TeacherManagement.service.TeacherService;

@CrossOrigin(origins = "*") //http://localhost:3000 
@RestController
@RequestMapping(value = "/api")

public class TeacherController 
{
	   @Autowired
       TeacherService ser;
	   
	   public TeacherController(TeacherService s)
	   {
		   super();
		   this.ser = s ;
	   }
	   
	   @PostMapping("/add")
	   public TeacherAvailability saveAvailibility(@RequestBody TeacherAvailability T)
	   {
		   return ser.addTeacherAvailability(T);
	   }
	   @PutMapping("/update")
	   public TeacherAvailability updateAvailibility(@RequestBody TeacherAvailability T)
	   {
		   return ser.updateTeacherAvailability(T);
	   }
	   @DeleteMapping(value = "/{id}")
	   public void deleteAvailibility(@PathVariable Long id)
	   {
		   ser.deleteTeacherAvailability(id);
	   }
	   @GetMapping("/{id}")
	   public TeacherAvailability getTeacherAvailibilityById(@PathVariable Long id)
	   {
		   return ser.getTeacherAvailability(id);
	   }
	   @GetMapping("/allTeacher")
	   public List<TeacherAvailability> getAllTeacherAvailibility()
	   {
		   return ser.getAllTeacherAvailabilities();
	   }
	   @GetMapping("/teacherDetails/{subject}")
	   public Optional<TeacherAvailability> getTeachers(@PathVariable String subject)
	   {
		return ser.findByName(subject);
		   
	   }
	   @GetMapping("/AvailableTeachersdetails/{available}")
	   public List<TeacherAvailability> getAvailableTeachers(@PathVariable Boolean available)
	   {
		return ser.findByAvailable(available);
		   
	   }
	   @GetMapping("/TeachersAvailableMoreThenGivenDays/{days}")
	   public List<TeacherAvailability> getTeachersAvailableMoreThenGivenDays(@PathVariable String days)
	   {
		   return ser.teacherAvailbleMoreThenGivenDays(days);
	   }
	   
}

