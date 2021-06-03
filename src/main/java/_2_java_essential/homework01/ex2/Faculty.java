package _2_java_essential.homework01.ex2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Faculty {
    private String facultyName;
    private Cathedra[] cathedras;

    Faculty(String facultyName, Cathedra[] cathedras) {
        this.facultyName = facultyName;
        this.cathedras = cathedras;
    }

    String getFacultyName() {
        return facultyName;
    }

    Cathedra[] getCathedras() {
        return cathedras;
    }

    /**
     * Метод, который получает список всех учителей на факультете
     */
    List<Teacher> getAllTeachersFromFaculty(){
        List<Teacher> list = new LinkedList<>();
        for (Cathedra cathedra : cathedras) {
            Collections.addAll(list, cathedra.getTeachers());
        }
        return list;
    }
}
