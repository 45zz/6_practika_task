package com.company;

public class Main {

    public static void main(String[] args) {
        Student [] students1=new Student[]{
                new Student(5),
                new Student(4.5),
                new Student(3),
                new Student(4.5),
                new Student(5)
        };
        Student [] students2=new Student[]{
                new Student(5),
                new Student(4.5),
                new Student(3),
                new Student(4.5),
                new Student(5)
        };

        for (Student t: students1
        ) {
            System.out.println(t.getiDNumber() +" "+t.getGPA());
        }
        System.out.println("\n\n");

        Student[] answer2=SortingStudentsByGPA.mergeStudents(students1,students2);//слияние двух списков
        for (Student t: answer2
        ) {
            System.out.println(t.getiDNumber() +" "+t.getGPA());
        }
    }
}
