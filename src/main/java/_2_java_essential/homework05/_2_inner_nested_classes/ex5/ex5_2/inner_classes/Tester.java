package _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_2.inner_classes;

import _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_2.inner_classes.University.Faculty;
import _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_2.inner_classes.University.Faculty.Cathedra;
import _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_2.inner_classes.University.Faculty.Cathedra.Teacher;

import java.util.List;


class Tester {
    public static void main(String[] args) {
        University university = getInitializedUniversity();


        /**EX1*/
        System.out.println("EX1");
        String name = "Кафедра математики";
        System.out.println("Люди на кафедре " + name);
        System.out.println(university.getTeachersOnCathedra(name));



        /**EX2*/
        System.out.println("\n\n\nEX2");
        name = "Факультет информатики";
        System.out.println("Люди на факультете " + name);
        System.out.println(university.getTeachersOnFaculty(name));



        /**EX3*/
        System.out.println("\n\n\nEX3");
        System.out.println(university.getUniqueSurnameAndName());


        /**EX4*/
        System.out.println("\n\n\nEX4");
        List<Teacher> teachers = university.getAllTeachers();
        System.out.println(teachers);
        university.sortTeachersInUniversity(teachers);
        System.out.println(teachers);
    }



    private static University getInitializedUniversity(){
        Teacher[] teachers11 = {new University().new Faculty().new Cathedra().new Teacher("Катерина","Малинина",false, 30),
                new University().new Faculty().new Cathedra().new Teacher("Андрей","Петров",true, 45),
                new University().new Faculty().new Cathedra().new Teacher("Петр","Розин",false, 55),
                new University().new Faculty().new Cathedra().new Teacher("Антон","Иванов",true, 35)};
        Teacher[] teachers12 = {new University().new Faculty().new Cathedra().new Teacher("Иванна","Яцура",false, 25),
                new University().new Faculty().new Cathedra().new Teacher("Федор","Деревьев",true, 38),
                new University().new Faculty().new Cathedra().new Teacher("Вячеслав","Борисов",true, 80)};

        Cathedra[] cathedras1 = {new University().new Faculty().new Cathedra("Кафедра математики", teachers11),
                new University().new Faculty().new Cathedra("Кафедра информатики", teachers12)};


        Teacher[] teachers21 = {new University().new Faculty().new Cathedra().new Teacher("Нина","Оленина",false, 34),
                new University().new Faculty().new Cathedra().new Teacher("Николай","Деревьев",true, 70)};
        Teacher[] teachers22 = {new University().new Faculty().new Cathedra().new Teacher("Ростислав","Проскуров",false, 27),
                new University().new Faculty().new Cathedra().new Teacher("Марина","Катина",true, 24),
                new University().new Faculty().new Cathedra().new Teacher("Святослав","Андреев",true, 100)};

        Cathedra[] cathedras2 = {new University().new Faculty().new Cathedra("Кафедра английского языка", teachers21),
                new University().new Faculty().new Cathedra("Кафедра японского языка", teachers22)};

        Faculty[] faculties = {new University().new Faculty("Факультет информатики", cathedras1),
                            new University().new Faculty("Факультет лингвистики", cathedras2)};

        return new University("НаУКМА", faculties);
    }


    public static String toStringTeachers(List<Teacher> list){
        String res = "";
        int counter = 1;
        for (Teacher teacher : list) {
            res += counter++ + ")" + teacher + "\n";
        }
        return res;
    }

    public static String toStringTeachers(Teacher[] teachers){
        String res = "";
        int counter = 1;
        for (Teacher teacher : teachers) {
            res += counter++ + ")" + teacher + "\n";
        }
        return res;
    }

    public static String toString(List<String> list){
        String res = "";
        int counter = 1;
        for (String str : list) {
            res += counter++ + ")" + str + "\n";
        }
        return res;
    }
}
