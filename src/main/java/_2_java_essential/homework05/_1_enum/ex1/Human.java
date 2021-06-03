package _2_java_essential.homework05._1_enum.ex1;

class Human {

    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private Country country;


    Human(String name, String surname, int age, Gender gender, Country country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.country = country;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name = " + name +
                ", surname = " + surname +
                ", age = " + age +
                ", gender = " + gender.getGender() +
                ", country = " + country.getCountry() +
                '}';
    }

}
