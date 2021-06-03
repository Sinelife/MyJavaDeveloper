package _2_java_essential.homework07.ex2;

class Student {

    private MainInfo mainInfo;
    private int age;
    private double averageMark;

    Student(MainInfo mainInfo, int age, double averageMark) {
        this.mainInfo = mainInfo;
        this.age = age;
        this.averageMark = averageMark;
    }

    public MainInfo getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(MainInfo mainInfo) {
        this.mainInfo = mainInfo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        if (getAge() != student.getAge()) {
            return false;
        }
        if (getAverageMark() != student.getAverageMark()) {
            return false;
        }
        return !getMainInfo().equals(student.getMainInfo());
    }

    @Override
    public int hashCode() {
        int result = getMainInfo() != null ? getMainInfo().hashCode() : 0;
        result = 31 * result + getAge() * 17;
        result = (int) (31 * result + getAverageMark());
        return result;
    }


    @Override
    public String toString() {
        return "Student{" +
                "mainInfo=" + mainInfo +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}
