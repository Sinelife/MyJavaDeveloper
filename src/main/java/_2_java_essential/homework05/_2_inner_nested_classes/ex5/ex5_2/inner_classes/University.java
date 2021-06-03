package _2_java_essential.homework05._2_inner_nested_classes.ex5.ex5_2.inner_classes;

import java.util.*;

class University {

    private String name;
    private Faculty[] faculties;

    University() {}

    University(String name, Faculty[] faculties) {
        this.name = name;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    private Faculty[] getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", faculties=" + Arrays.toString(faculties) +
                '}';
    }


    /**
     * Метод, который получает список учителей на кафедре
     */
    List<Faculty.Cathedra.Teacher> getTeachersOnCathedra(String cathedraName) {
        for (Faculty faculty : faculties) {
            for (Faculty.Cathedra cathedra : faculty.getCathedras()) {
                if (cathedra.getCathedraName().equals(cathedraName)) {
                    return Arrays.asList(cathedra.getTeachers());
                }
            }
        }
        return null;
    }


    /**
     * Метод, который получает список учителей на факультете
     */
    List<Faculty.Cathedra.Teacher> getTeachersOnFaculty(String facultyName) {
        List<Faculty.Cathedra.Teacher> teachers = new ArrayList<>();
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyName().equals(facultyName)) {
                teachers.addAll(faculty.getAllTeachersFromFaculty());
            }
        }
        return teachers;
    }


    /**
     * Метод, который получает список уникальных имен и фамилий всех людей в институте
     */
    List<String> getUniqueSurnameAndName(){
        List<String> list = new LinkedList<>();
        for (Faculty faculty : faculties) {
            for (Faculty.Cathedra cathedra : faculty.getCathedras()) {
                for (Faculty.Cathedra.Teacher teacher : cathedra.getTeachers()) {
                    if(!list.contains(teacher.getName())) {
                        list.add(teacher.getName());
                    }
                    if(!list.contains(teacher.getSurname())) {
                        list.add(teacher.getSurname());
                    }
                }
            }
        }
        return list;
    }

    /**
     * Метод, который получает всех учителей в институте
     */
    List<Faculty.Cathedra.Teacher> getAllTeachers() {
        List<Faculty.Cathedra.Teacher> teachers = new ArrayList<>();
        for (Faculty faculty : faculties) {
            teachers.addAll(faculty.getAllTeachersFromFaculty());
        }
        return teachers;
    }



    /**
     * Метод, который получает большее из двух слов
     */
    private static String getBiggerWord(String word1, String word2){
        return word1.length() >= word2.length() ? word1 : word2;
    }

    /**
     * Метод, который проверяет больше ли первое слово чем второе
     */
    private static boolean firstLess(String word1, String word2){
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        String biggerWord = getBiggerWord(word1, word2);
        for (int i = 0; i < biggerWord.length(); i++) {
            if(chars1[i] < chars2[i]){
                return true;
            } else if(chars1[i] > chars2[i]){
                return false;
            }
        }
        return false;
    }

    /**
     * Метод, который сортирует учителей института по фамилии
     */
    void sortTeachersInUniversity(List<Faculty.Cathedra.Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            for (int j = i; j < teachers.size(); j++) {
                if(firstLess(teachers.get(j).getSurname(), teachers.get(i).getSurname())){
                    Faculty.Cathedra.Teacher temp = teachers.get(i);
                    teachers.set(i, teachers.get(j));
                    teachers.set(j, temp);
                }
            }
        }
    }



    class Faculty {
        private String facultyName;
        private Cathedra[] cathedras;

        Faculty() {}

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
        List<Cathedra.Teacher> getAllTeachersFromFaculty(){
            List<Cathedra.Teacher> list = new LinkedList<>();
            for (Cathedra cathedra : cathedras) {
                Collections.addAll(list, cathedra.getTeachers());
            }
            return list;
        }

        class Cathedra {

            private String cathedraName;
            private Teacher[] teachers;

            Cathedra() {}

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


            class Teacher {
                private String name;
                private String surname;
                private boolean isProfessor;
                private int age;

                Teacher() {}

                Teacher(String name, String surname, boolean isProfessor, int age) {
                    this.name = name;
                    this.surname = surname;
                    this.isProfessor = isProfessor;
                    this.age = age;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSurname() {
                    return surname;
                }

                public void setSurname(String surname) {
                    this.surname = surname;
                }

                public int getAge() {
                    return age;
                }

                public void setAge(int age) {
                    this.age = age;
                }


                @Override
                public String toString() {
                    return name + " " + surname + ", " + age + " лет, " + (isProfessor ? "профессор" : "не профессор") + "\n";
                }
            }
        }
    }

}
