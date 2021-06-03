package _2_java_essential.homework01.ex2;

class Cathedra {

    private String cathedraName;
    private Teacher[] teachers;


    Cathedra(String cathedraName, Teacher[] teachers) {
        this.cathedraName = cathedraName;
        this.teachers = teachers;
    }

    String getCathedraName() {
        return cathedraName;
    }

    Teacher[] getTeachers() {
        return teachers;
    }
}
