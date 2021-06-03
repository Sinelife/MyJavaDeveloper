package _2_java_essential.homework01.ex2;

import java.util.*;

class University {

    private String name;
    private Faculty[] faculties;

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
    List<Teacher> getTeachersOnCathedra(String cathedraName) {
        for (Faculty faculty : faculties) {
            for (Cathedra cathedra : faculty.getCathedras()) {
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
    List<Teacher> getTeachersOnFaculty(String facultyName) {
        List<Teacher> teachers = new ArrayList<>();
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
            for (Cathedra cathedra : faculty.getCathedras()) {
                for (Teacher teacher : cathedra.getTeachers()) {
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
    List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
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
    void sortTeachersInUniversity(List<Teacher> teachers) {
        for (int i = 0; i < teachers.size(); i++) {
            for (int j = i; j < teachers.size(); j++) {
                if(firstLess(teachers.get(j).getSurname(), teachers.get(i).getSurname())){
                    Teacher temp = teachers.get(i);
                    teachers.set(i, teachers.get(j));
                    teachers.set(j, temp);
                }
            }
        }
    }

}
