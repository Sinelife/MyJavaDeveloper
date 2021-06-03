package _2_java_essential.homework06._2_local_classes.ex5;

class Tester {
    public static void main(String[] args) {
        LocalClassesService service = new LocalClassesService();
        service.strangeOutput(
                new Human("Jack", "Johson", 20, Gender.BOY),
                new Human("Peter", "Peterson", 40, Gender.BOY),
                new Human("Freddy", "Loran", 30, Gender.BOY),
                new Human("Sara", "White", 36, Gender.GIRL),
                new Human("Maggy", "Robbinson", 45, Gender.GIRL),
                new Human("Caul", "Black", 40, Gender.BOY),
                new Human("Kaila", "Black", 43, Gender.GIRL),
                new Human("Lara", "Moon", 17, Gender.GIRL),
                new Human("Unas", "Immortal", 78, Gender.BOY),
                new Human("Ron", "Immortal", 111, Gender.BOY),
                new Human("Lion", "Green", 40, Gender.BOY),
                new Human("Hellen", "Green", 40, Gender.GIRL)
                );


    }
}
