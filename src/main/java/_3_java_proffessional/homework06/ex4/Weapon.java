package _3_java_proffessional.homework06.ex4;


@JsonEntity
class Weapon {

    @JsonField
    private String type;

    @JsonField
    private int power;

    @JsonField
    private Rune[] runes;


    Weapon(String type, int power, Rune[] runes) {
        this.type = type;
        this.power = power;
        this.runes = runes;
    }
}
