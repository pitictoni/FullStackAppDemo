package com.example.fullstackappdemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServices {

    private StudentRepository studentRepository;

    public StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ArrayList<Student> addTestStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"Antoniu", "Pitic", "antoniu.pitic@ulbsibiu.ro","..\\img\\pozaLuPitic.jpg"));
        students.add(new Student(2,"Dragos", "Savescu", "dragos.savescu@ulbsibiu.ro","..\\img\\pozaLuSavescu.jpg"));
        students.add(new Student(3,"Alexandra", "Rada", "alexandra.rada@ulbsibiu.ro","..\\img\\pozaLuRada.jpg"));
        return (ArrayList<Student>) studentRepository.saveAll(students);
    }
}
