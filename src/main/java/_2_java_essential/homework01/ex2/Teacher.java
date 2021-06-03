package _2_java_essential.homework01.ex2;

class Teacher {
    private String name;
    private String surname;
    private boolean isProfessor;
    private int age;


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

