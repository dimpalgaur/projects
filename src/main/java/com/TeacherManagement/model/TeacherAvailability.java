package com.TeacherManagement.model;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "teacher_Availability")
@Entity
public class TeacherAvailability {
	
	@Id
	//@GeneratedValue()
	 private Long id;

	    @Column(name="teacherName")
	    private String teacherName;
	    @Column(name="className")
	    private String className;
	    @Column(name="dayOfWeek")
	    private String dayOfWeek;
	    @Column(name="startTime")
	    private LocalTime startTime;
	    @Column(name="endTime")
	    private LocalTime endTime;
	    @Column(name="isAvailable")
	    private Boolean isAvailable;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTeacherName() {
			return teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getDayOfWeek() {
			return dayOfWeek;
		}
		public void setDayOfWeek(String dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
		}
		public LocalTime getStartTime() {
			return startTime;
		}
		public void setStartTime(LocalTime startTime) {
			this.startTime = startTime;
		}
		public LocalTime getEndTime() {
			return endTime;
		}
		public void setEndTime(LocalTime endTime) {
			this.endTime = endTime;
		}
		public Boolean getIsAvailable() {
			return isAvailable;
		}
		public void setIsAvailable(Boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
		@Override
		public String toString() {
			return "TeacherAvailability [id=" + id + ", teacherName=" + teacherName + ", className=" + className
					+ ", dayOfWeek=" + dayOfWeek + ", startTime=" + startTime + ", endTime=" + endTime
					+ ", isAvailable=" + isAvailable + "]";
		}
		public TeacherAvailability() {
			super();
			// TODO Auto-generated constructor stub
		}
		public TeacherAvailability(Long id, String teacherName, String className, String dayOfWeek, LocalTime startTime,
				LocalTime endTime, Boolean isAvailable) {
			super();
			this.id = id;
			this.teacherName = teacherName;
			this.className = className;
			this.dayOfWeek = dayOfWeek;
			this.startTime = startTime;
			this.endTime = endTime;
			this.isAvailable = isAvailable;
		}
	    
	    

}
