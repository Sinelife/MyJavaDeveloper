package _3_java_proffessional.homework06.ex3;

public enum Gender {
    GIRL("Девушка"),
    BOY("Парень");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String get() {
        return gender;
    }
}
