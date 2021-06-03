package _3_java_proffessional.homework00.ex3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static _3_java_proffessional.homework00.ex3.StringUtils.firstWordIsLess;

public class StudentSorter {

    private StudentComparators comparatorName;

    StudentSorter(StudentComparators comparatorName) {
        this.comparatorName = comparatorName;
    }


    private Comparator getComparator() {
        if (comparatorName.equals(StudentComparators.NAME_COMPARATOR)) {
            return new NameComparator();
        } else if (comparatorName.equals(StudentComparators.NAME_REVERSE_COMPARATOR)) {
            return new NameReverseComparator();
        } else if (comparatorName.equals(StudentComparators.SURNAME_COMPARATOR)) {
            return new SurnameComparator();
        } else if (comparatorName.equals(StudentComparators.SURNAME_REVERSE_COMPARATOR)) {
            return new SurnameReverseComparator();
        } else if (comparatorName.equals(StudentComparators.AGE_COMPARATOR)) {
            return new AgeComparator();
        } else if (comparatorName.equals(StudentComparators.AGE_REVERSE_COMPARATOR)) {
            return new AgeReverseComparator();
        }
        throw new IllegalArgumentException("No such Comparator");
    }

    public enum StudentComparators {
        NAME_COMPARATOR,
        NAME_REVERSE_COMPARATOR,
        SURNAME_COMPARATOR,
        SURNAME_REVERSE_COMPARATOR,
        AGE_COMPARATOR,
        AGE_REVERSE_COMPARATOR,
    }

    public void sort(List<Student> students) {
        Collections.sort(students, getComparator());
    }

    public void defaultSort(List<Student> students) {
        Collections.sort(students);
    }

    static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.compareTo(o2);
        }
    }


    static class NameReverseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (firstWordIsLess(o1.getName(), o2.getName())) {
                return 1;
            }
            return -1;
        }
    }


    static class SurnameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (!firstWordIsLess(o1.getSurname(), o2.getSurname())) {
                return 1;
            }
            return -1;
        }
    }


    static class SurnameReverseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (firstWordIsLess(o1.getSurname(), o2.getSurname())) {
                return 1;
            }
            return -1;
        }
    }

    static class AgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    }

    static class AgeReverseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge() - o1.getAge();
        }
    }

}
