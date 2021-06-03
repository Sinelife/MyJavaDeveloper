package _3_java_proffessional.homework06.ex4;

@JsonEntity
class Modification {
    @JsonField
    String value;

    Modification(String value) {
        this.value = value;
    }
    Modification(){}

    @Override
    public String toString() {
        return "Rune{" +
                "value='" + value + '\'' +
                '}';
    }
}
