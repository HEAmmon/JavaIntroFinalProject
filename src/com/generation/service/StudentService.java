package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void showSummary()
    {
        //TODO implement
       System.out.println( "Student Name:" );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println(student);
        }
        System.out.println( "Course(s) Student is Enrolled in: " );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println(student.getCourses());
        }
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
