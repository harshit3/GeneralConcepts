package com.tcs.cms.students;

//this package must be imported to use Teacher class functionality.
import com.tcs.cms.teachers.Teacher;

public class Student {
	
	public static void main(String[] args) {
		
	Teacher teacher = new Teacher();
	teacher.attendance();
	
	//this method is not visible here.(as it is not public)-
	//teacher.calcMarks();
	}

}
