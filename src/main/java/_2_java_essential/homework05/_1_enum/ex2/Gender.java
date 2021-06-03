package _2_java_essential.homework05._1_enum.ex2;

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
