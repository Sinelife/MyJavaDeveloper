package _3_java_proffessional.homework04.ex1;

import java.util.Scanner;

class Tester {

    private static final String FILE_PATH = "C:\\Users\\Ярослав\\JavaDeveloper\\src\\main\\other\\java_proffessional\\homework04\\ex1\\text.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        TextWriterService service = new TextWriterService(text, FILE_PATH);
        service.write(TextWriterService.CopyVariants.RANDOM_WORDS);
        //rite(new Student("Yaroslav", "Serzhan", 22, 88.8, Gender.BOY));
//        service.write(Arrays.asList(
//                new Student("Anna", "Petrova", 17, 78.0, Gender.GIRL),
//                new Student("Yaroslav", "Serzhan", 22, 88.8, Gender.BOY),
//                new Student("Olexander", "Yaroshepta", 21, 99.99, Gender.BOY)),
//                ALL_STUDENTS_IN_FILES_BY_FIELDS
//        );
    }
}
