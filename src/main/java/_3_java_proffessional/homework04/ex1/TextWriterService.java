package _3_java_proffessional.homework04.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

import static _3_java_proffessional.homework04.ex1.Gender.BOY;
import static _3_java_proffessional.homework04.ex1.TextWriterService.CopyVariants.*;

class TextWriterService {

    private static final String NAMES_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\fields\\Names.txt";
    private static final String SURNAMES_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\fields\\Surnames.txt";
    private static final String AVERAGE_OF_ALL_MARKS_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\fields\\AverageMarkOfAll.txt";
    private static final String AGE_INTERVAL_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\fields\\Age.txt";
    private static final String GENDER_FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\fields\\Gender.txt";
    private static final String STUDENT_UNIQUE_FILES_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\students\\";
    private static List<Character> chars;

    static {
        chars = new ArrayList<>();
        for (int i = 0; i < 140; i++) {
            char c = (char) i;
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                chars.add((char) i);
            }
        }
    }

    private String text;
    private File file;

    TextWriterService(String text, String fileName) {
        this.text = text;
        this.file = new File(fileName);
    }

    void setNewText(String text) {
        this.text = text;
    }


    /**
     * Метод, для выбора каким образом записать введенный с клавиатуры текст
     */
    void write(CopyVariants variant) {
        if(variant.equals(ALL_TEXT)) {
            copyTextToFile(text);
        } else if (variant.equals(ALL_NUMBERS)) {
            copyNumbersToFile();
        } else if (variant.equals(ALL_WORDS_WITH_SIZE_3_OR_FIRST_LETTER_A_B)) {
            copySpecificWordsToFile();
        } else if (variant.equals(RANDOM_WORDS)) {
            copyRandomWordsToFile();
        }
    }



    /**
     * 2) Метод, который записывает в файл все числа данного текста
     */
    private void copyNumbersToFile() {
        copyTextToFile(getAllNumbersFromTextInString());
    }

    /**
     * Метод, который получает в виде строки все числа данного текста
     */
    private String getAllNumbersFromTextInString() {
        char[] chars = text.replaceAll("\\s{2,}", " ").toCharArray();
        String number = "";
        String res = "";
        for (int i = 0; i < chars.length; i++) {
            if (symbolIsDigit(chars[i])) {
                number += chars[i];
            } else if (!symbolIsDigit(chars[i]) && i > 0 && symbolIsDigit(chars[i - 1])) {
                res += number + ", ";
                number = "";
            }
        }
        return res + number;
    }

    /**
     * Метод, который проверяет являеться ли символ цыфрой
     */
    private boolean symbolIsDigit(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }



    /**
     * 3) Метод, который записывает в файл все слова с длиной меньше 3 символов
     * или у которых первая букав a или b
     */
    private void copySpecificWordsToFile() {
        copyTextToFile(getAllSpecificWordsFromText());
    }


    /**
     * Метод, который получает как строку все слова с длиной меньше 3
     * символов или у которых первая букав a или b
     */
    private String getAllSpecificWordsFromText() {
        String res = "";
        for (String word : getAllWordsFromText()) {
            if (word.length() < 3 || wordHasFirstLetter(word, new char[]{'a','b'})) {
                res += word + ", ";
            }
        }
        return res;
    }

    /**
     * Метод, для проверки есть ли первая буква из масива символов в слове
     */
    private boolean wordHasFirstLetter(String word, char[] symbols) {
        for (char symbol : symbols) {
            if (word.indexOf(symbol) == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Метод, для получения списка всех слов
     */
    private List<String> getAllWordsFromText() {
        return Arrays.asList(
                text.replaceAll("\\s{2,}", " ")
                        .replaceAll("[^a-zA-Z ]", "")
                        .split(" ")
        );
    }


    private void copyRandomWordsToFile() {
        copyTextToFile(getRandomWordList().toString());
    }

    private List<String> getRandomWordList() {
        List<String> list = new ArrayList<>();
        int listSize = random.nextInt(40) + 30;
        for (int i = 0; i < listSize; i++) {
            list.add(getRandWord());
        }
        return list;
    }

    private String getRandWord() {
        int wordSize = random.nextInt(6) + 3;
        String word = "";
        for (int i = 0; i < wordSize; i++) {
            word += getRandomLetter();
        }
        return word;
    }

    private char getRandomLetter() {
        return chars.get(random.nextInt(chars.size()));
    }


    /**
     * 5) Метод, который записывает в файл студента
     */
    <E>void write(E elem) {
        copyTextToFile(elem.toString(), file);
    }


    /**
     * Метод, для выбора каким образом записать список студентов
     */
    void write(List<Student> list, CopyVariants variant) {
        if(variant.equals(CopyVariants.ALL_STUDENTS)) {
            writeList(list);
        } else if(variant.equals(CopyVariants.ALL_STUDENTS_IN_DIFFERENT_FILES)) {
            writeStudentsInDifferentFiles(list);
        } else if(variant.equals(CopyVariants.ALL_STUDENTS_IN_FILES_BY_FIELDS)) {
            writeFieldsInDifferentFiles(list);
        }
    }


    /**
     * 6) Метод, который записывает в файл всех студентов списка
     */
    private <E> void writeList(List<E> list) {
        String res = "";
        for (E elem : list) {
            res += elem.toString() + "\n";
        }
        copyTextToFile(res);
    }

    /**
     * 7) Метод, который записывает информацию про всех студентов списка в
     * правильые файлы по именам, фамилиям и тд
     */
    private void writeFieldsInDifferentFiles(List<Student> list) {
        writeNamesInFile(list);
        writeSurnamesInFile(list);
        writeAverageMarkInFile(list);
        writeAgeIntervalInFile(list);
        writeGenderInFile(list);
    }

    /**
     * Метод, для записи количества девушек и парней в отдельный файл
     */
    private void writeGenderInFile(List<Student> students) {
        int girlsNum = 0;
        int boysNum = 0;
        for (Student student : students) {
            if(student.getGender().equals(BOY)) {
                boysNum++;
            } else {
                girlsNum++;
            }
        }
        String result = girlsNum + " девушки, " + boysNum + " парней.";
        copyTextToFile(result, new File(GENDER_FILE_PATH));
    }

    /**
     * Метод, для записи диапазона возрастов в отдельный файл
     */
    private void writeAgeIntervalInFile(List<Student> students) {
        int minAge = students.get(0).getAge();
        int maxAge = minAge;
        for (Student student : students) {
            int age = student.getAge();
            if (age > maxAge) {
                maxAge = age;
            }
            if (age < minAge) {
                minAge = age;
            }
        }
        String result = "Все студенты  " + minAge + " - " + maxAge + " лет";
        copyTextToFile(result, new File(AGE_INTERVAL_FILE_PATH));
    }

    /**
     * Метод, для записи среднего бала по всем студентам в отдельный файл
     */
    private void writeAverageMarkInFile(List<Student> students) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getAverageMark();
        }
        String averageOfAllMark = String.valueOf(((double) sum / students.size()));
        copyTextToFile(averageOfAllMark, new File(AVERAGE_OF_ALL_MARKS_FILE_PATH));
    }

    /**
     * Метод, для записи уникальных фамилий в отдельный файл фамилий
     */
    private void writeSurnamesInFile(List<Student> students) {
        Set<String> surnames = new HashSet<>();
        for (Student student : students) {
            surnames.add(student.getSurname());
        }
        StringBuilder result = new StringBuilder();
        for (String surname : surnames) {
            result.append(surname).append("\n");
        }
        copyTextToFile(result.toString(), new File(SURNAMES_FILE_PATH));
    }

    /**
     * Метод, для записи уникальных имен в отдельный файл имен
     */
    private void writeNamesInFile(final List<Student> students) {
        Set<String> names = new HashSet<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        StringBuilder result = new StringBuilder();
        for (String name : names) {
            result.append(name).append("\n");
        }
        copyTextToFile(result.toString(), new File(NAMES_FILE_PATH));
    }


    /**
     * 8) Метод, который записывает информацию про всех студентов списка в
     * отдельный файл для каждого студента
     */
    private void writeStudentsInDifferentFiles(List<Student> students) {
        for (Student student : students) {
            String path = STUDENT_UNIQUE_FILES_PATH + student.getName() + "_" + student.getSurname();
            write(student, new File(path));
        }
    }

    /**
     * Метод, который записывает студента в файл, с конкретным путем
     */
    private <E>void write(E elem, File file) {
        copyTextToFile(elem.toString(), file);
    }





    /**
     * Метод, который копирует строку в файл
     */
    private void copyTextToFile(String text, File file) {
        try {
            Writer writer = new FileWriter(file, false);
            char[] chars = text.toCharArray();
            for (char aChar : chars) {
                writer.append(aChar);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод, который копирует строку в файл
     */
    private void copyTextToFile(String text) {
        copyTextToFile(text, file);
    }


    /**
     * Перечисления для вариантов обрабатывания текста и вывода его
     */
    enum CopyVariants {
        ALL_TEXT,
        ALL_NUMBERS,
        ALL_WORDS_WITH_SIZE_3_OR_FIRST_LETTER_A_B,
        RANDOM_WORDS,
        ALL_STUDENTS,
        ALL_STUDENTS_IN_DIFFERENT_FILES,
        ALL_STUDENTS_IN_FILES_BY_FIELDS
    }

    private Random random = new Random();
}
