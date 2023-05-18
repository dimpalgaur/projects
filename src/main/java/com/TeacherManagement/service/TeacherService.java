package com.TeacherManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TeacherManagement.exception.ResourceNotFoundException;
import com.TeacherManagement.model.TeacherAvailability;
import com.TeacherManagement.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherAvailabilityRepository;
    
    public TeacherService(TeacherRepository r)
    {
    	super();
    	this.teacherAvailabilityRepository = r;
    }

    public TeacherAvailability addTeacherAvailability(TeacherAvailability teacherAvailability) {
        return teacherAvailabilityRepository.save(teacherAvailability);
    }

    public TeacherAvailability updateTeacherAvailability(TeacherAvailability teacherAvailability) {
        return teacherAvailabilityRepository.save(teacherAvailability);
    }

    public void deleteTeacherAvailability(Long id) {
		teacherAvailabilityRepository.deleteById(id);;
    }

    public TeacherAvailability getTeacherAvailability(Long id) {
        return teacherAvailabilityRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("TeacherAvailability", "id", id));
    }

    public List<TeacherAvailability> getAllTeacherAvailabilities() {
        return teacherAvailabilityRepository.findAll();
    }
    public Optional<TeacherAvailability> findByName(String subject) {
		// TODO Auto-generated method stub
		return teacherAvailabilityRepository.findByName(subject);
	}
    public List<TeacherAvailability> findByAvailable(Boolean isavailable)
    {
		return teacherAvailabilityRepository.findByAvailability(isavailable);
    	
    }
    public List<TeacherAvailability> teacherAvailbleMoreThenGivenDays(String days)
    {
    	return teacherAvailabilityRepository.TeachersAvailableMoreThenGivenDays(days);
    }
}
