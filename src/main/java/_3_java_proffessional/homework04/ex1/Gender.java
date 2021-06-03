package _3_java_proffessional.homework04.ex1;

public enum Gender {
    GIRL("Девушка"),
    BOY("Парень");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
