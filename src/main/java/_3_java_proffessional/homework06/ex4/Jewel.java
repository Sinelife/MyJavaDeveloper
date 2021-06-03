package _3_java_proffessional.homework06.ex4;



@JsonEntity
class Jewel {

    @JsonField
    private String type;

    @JsonField
    private String ability;

    @JsonField
    private int[] numbers;

    Jewel(String type, String ability, int[] numbers) {
        this.type = type;
        this.ability = ability;
        this.numbers = numbers;
    }
}
