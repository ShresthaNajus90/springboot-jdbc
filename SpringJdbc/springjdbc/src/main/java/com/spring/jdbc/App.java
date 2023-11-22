package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "programe started................." );
        //spring jdbc => jdbc Template
        
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
     StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);
     
     Student student=studentDao.getStudent(466);
     System.out.println(student);
     
     List<Student> students = studentDao.getAllStudents();
     for(Student s:students) {
    	 System.out.println(s);
     }
     
//     Student student = new Student();
//     student.setId(466);
//     student.setName("sophia");
//     student.setCity("North Salt lake city");
//     
//     int result =  studentDao.insert(student);
//     System.out.println("student added" + result);
     
//     Student student = new Student();
//     student.setId(456);
//     student.setName("Binita");
//     student.setCity("North Salt lake city");
//     int result = studentDao.change(student);
//     System.out.println("sudent updated" + result);
//     

     //DELETE
//     int delete = studentDao.delete(456);
//     System.out.println("delet studnet id:" + delete);
//     
     
    }
}
