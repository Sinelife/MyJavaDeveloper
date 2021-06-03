package _3_java_proffessional.homework06.ex3;

import java.util.ArrayList;
import java.util.List;

class StudentDecorator {

    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    private static final String AGE = "age";
    private static final String AVERAGE_MARK = "averageMark";
    private static final String GENDER = "gender";

    private static final String GET_MARK_IN_LETTER = "getMarkInLetter";
    private static final String GET_AVERAGE_MARK_OF_LIST = "getAverageMarkOfList";
    private static final String GET_STUDENT_WITH_THE_BEST_MARK = "getStudentWithTheBestMark";
    public static final String SORT_STUDENTS_BY_MARK = "sortStudentsByMark";

    private AccessAllInClassService service;

    StudentDecorator(String name, String surname, Integer age, Double averageMark, Gender gender) {
        service = new AccessAllInClassService<>(Student.class);
        service.newInstance(name, surname, age, averageMark, gender);
    }

    private StudentDecorator(Student student) {
        service = new AccessAllInClassService<>(student);
    }

    Student getStudent() {
        return (Student) service.getElem();
    }

    String getName() {
        return (String) service.getFieldValue(NAME);
    }

    void setName(String name) {
        service.setFieldValue(NAME, name);
    }

    String getSurname() {
        return (String) service.getFieldValue(SURNAME);
    }

    void setSurname(String surname) {
        service.setFieldValue(SURNAME, surname);
    }

    Integer getAge() {
        return (Integer) service.getFieldValue(AGE);
    }

    void setAge(Integer age) {
        service.setFieldValue(AGE, age);
    }

    Double getAverageMark() {
        return (Double) service.getFieldValue(AVERAGE_MARK);
    }

    void setAverageMark(Double averageMark) {
        service.setFieldValue(AVERAGE_MARK, averageMark);
    }

    Gender getGender() {
        return (Gender) service.getFieldValue(GENDER);
    }

    void setGender(Gender gender) {
        service.setFieldValue(GENDER, gender);
    }


    public String toString() {
        return service.toString();
    }


    String getMarkInLetter() {
        return (String) service.invokeMethod(GET_MARK_IN_LETTER);
    }

    double getAverageMarkOfList(List<StudentDecorator> students) {
        return (double) service.invokeMethod(GET_AVERAGE_MARK_OF_LIST, getStudentList(students));
    }

    StudentDecorator getStudentWithTheBestMark(List<StudentDecorator> students) {
        Student student = (Student) service.invokeMethod(GET_STUDENT_WITH_THE_BEST_MARK, getStudentList(students));
        return new StudentDecorator(student);
    }

    void sortStudentsByMark(List<StudentDecorator> students) {
        service.invokeMethod(SORT_STUDENTS_BY_MARK, getStudentList(students));
        for (int i = 0; i < students.size(); i++) {
            for (int j = i; j < students.size(); j++) {
                if(students.get(j).getAverageMark() > students.get(i).getAverageMark()){
                    StudentDecorator temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    List<Student> getStudentList(List<StudentDecorator> list) {
        List<Student> students = new ArrayList<>();
        for (StudentDecorator studentDecorator : list) {
            students.add(studentDecorator.getStudent());
        }
        return students;
    }
}
