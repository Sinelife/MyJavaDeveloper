package _3_java_proffessional.homework06.ex4;

@JsonEntity
class Rune {

    @JsonField
    String name;

    Rune(){}

    Rune(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rune{" +
                "name='" + name + '\'' +
                '}';
    }
}
