package _2_java_essential.homework06._2_local_classes.ex5;

enum Gender {
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
