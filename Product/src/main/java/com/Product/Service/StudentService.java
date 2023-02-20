package com.Product.Service;

import com.Product.Models.Laptop;
import com.Product.Models.StudentInfo;
import com.Product.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentService {
    @Autowired
    private  StudentRepo studentRepo;
    public void save(StudentInfo studentInfo){
        studentRepo.save(studentInfo);
    }
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setName("s1");
        studentInfo.setAbout("superb");
        StudentService studentService = new StudentService();
        studentService.save(studentInfo);

    }
}
