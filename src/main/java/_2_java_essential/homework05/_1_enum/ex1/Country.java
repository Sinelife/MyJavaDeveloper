package _2_java_essential.homework05._1_enum.ex1;

enum Country {
    UKRAINE("Украина"),
    USA("США"),
    FRANCE("Франция"),
    ENGLAND("Англия"),
    GERMANY("Германия"),
    CHINA("Китай"),
    JAPAN("Япония"),
    SOUTH_KOREA("Южная Корея"),
    SINGAPORE("Сингапур"),
    THAILAND("Тайланд"),
    POLAND("Польша"),
    HUNGARY("Венгрия"),
    TURKEY("Турция"),
    GREECE("Греция");

    private String country;

    Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

}
