package _2_java_essential.zzz_fourth_extra_homework;

import _2_java_essential.zzz_fourth_extra_homework.objects._5_organism.Gender;

import java.util.*;

import static _2_java_essential.zzz_fourth_extra_homework.GeneratorService.StringType.*;

public class GeneratorService {
    private static final Random random = new Random();

    public Boolean getGeneratedBoolean() {
        return random.nextInt(10) % 2 == 0;
    }

    public Integer getGeneratedInteger(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public Double getGeneratedDouble(int min, int max) {
        return min + (max - min) * random.nextDouble();
    }



    public Gender getGeneratedGender() {
        int index = random.nextInt(Gender.values().length);
        return Gender.values()[index];
    }

    public <E extends Enum<E>> E getGeneratedEnumValue(E elem) {
        int index = random.nextInt(elem.getClass().getEnumConstants().length);
        return (E) elem.getClass().getEnumConstants()[index];
    }



    public String getGeneratedString(StringType type) {
        switch (type) {
            case NAME:
                return getGeneratedName();
            case PHONE:
                return getGeneratedPhone();
            case ADDRESS:
                return getGeneratedAddress();
            case SUBJECT:
                return getSubjectName();
            case SPACESHIP_NAME:
                return getGeneratedSpaceShipName();
            case STRING:
                return getGeneratedString();
        }
        return null;
    }


    private String getGeneratedSpaceShipName() {
        return getGeneratedName() + "-" + getGeneratedInteger(10, 99) + getGeneratedSymbol();
    }


    private String getSubjectName() {
        String[] subjects = {"Higher Math", "Linear Algebra", "Discrete Math", "Analytic Geometry", "Theory of Graphs", "Theory of Probability", "Theory of Algorithm", "Object-Oriented Programming C++", "Procedure Programming C++", "Java EE", "C#.NET", "Python", "Ruby", "PHP", "JavaScript", "Logic Programming", "Functional Programming", "Structural Programming", "Assembler", "Delphi", "Pascal", "Cloud Technologies", "Information Finding", "Artificial Intelligence", "Spring Framework", "Hibernate", "Google App Engine", "Data Bases", "Knowledge Bases"};
        return subjects[random.nextInt(subjects.length - 1)];
    }


    private String getGeneratedAddress() {
        return "Street " + getGeneratedString(STRING) + " Building " + getGeneratedInteger(0, 98);
    }



    private String getGeneratedPhone() {
        return getGeneratedPhonePart(3) + "-" + getGeneratedPhonePart(2) + "-" + getGeneratedPhonePart(2);
    }

    private String getGeneratedPhonePart(int size) {
        return size == 2 ? String.valueOf(random.nextInt(89) + 10) : String.valueOf(random.nextInt(899) + 100);
    }



    private String getGeneratedName() {
        int partsNum = random.nextInt(4) + 2;
        String name = "";
        for (int i = 0; i < partsNum; i++) {
            name += getRandomPart();
        }
        return getWordWithBigLetter(name);
    }

    private String getWordWithBigLetter(String name) {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    private String getRandomPart() {
        int partType = random.nextInt(10) + 1;
        return partType < 7 ? getBigPart() : getSmallPart();
    }

    private String getSmallPart() {
        return vocals[random.nextInt(vocals.length)];
    }

    private String getBigPart() {
        return odds[random.nextInt(odds.length)] + vocals[random.nextInt(vocals.length)];
    }

    private String getGeneratedString() {
        int wordSize = random.nextInt(12) + 3;
        String res = "";
        for (int i = 0; i < wordSize; i++) {
            res += getGeneratedSymbol();
        }
        return res;
    }

    private String getGeneratedSymbol() {
        return String.valueOf((char) (random.nextInt('z' - 'a') + 97));
    }


    private static String[] vocals = new String[]{"a", "o", "u", "i", "e", "y"};
    private static String[] odds = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

    public enum StringType {
        NAME, PHONE, ADDRESS, SUBJECT, SPACESHIP_NAME, STRING
    }


    public Character getGeneratedCharFromCharArray(Character[] array) {
        return array[random.nextInt(array.length)];
    }
}
