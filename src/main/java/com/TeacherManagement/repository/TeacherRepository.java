package com.TeacherManagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.TeacherManagement.model.TeacherAvailability;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherAvailability, Long>
{
	@Query(value = "SELECT * from teacher_availability where class_name=:subject2", nativeQuery =true)
	Optional<TeacherAvailability> findByName(@Param("subject2") String subject3);
	//List<TeacherAvailability> findByName(@Param("subject2") String subject3);
	//subject2 used to map the SQL table column to subject variable subject3 variable
	
	/*
	 * This query will find a teacher from the database who teaches a specific
	 * subject. The parameter "subject" is passed to the query and the resulting
	 * record will be mapped to a Teacher object. The "Optional" wrapper indicates
	 * that the query may return null if no record is found. The "nativeQuery =true"
	 * attribute indicates that the query will be executed using native SQL syntax.
	 */
	
	@Query(value="SELECT * from teacher_availability where is_available=:available", nativeQuery = true)
	List<TeacherAvailability> findByAvailability(@Param("available") Boolean isAvailable);
	
	@Query(value="SELECT * from teacher_availability where day_of_week>:weekDays", nativeQuery = true)
	List<TeacherAvailability> TeachersAvailableMoreThenGivenDays(@Param("weekDays") String days);
}
