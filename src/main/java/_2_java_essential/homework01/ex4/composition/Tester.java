package _2_java_essential.homework01.ex4.composition;

class Tester {
    public static void main(String[] args) {
        Person[] people = {new Person("Ростислав", "Нагорный", 31, "програмист", 50000, 12000),
                            new Person("Антонина", "Петрова", 24, "парикмахер", 12000, 1200),
                            new Person("Федор", "Климкин", 44, "строитель", 14000, 4200),
                            new Person("Елена", "Перова", 34, "бухгалтер", 17000, 8000),
                            new Person("Дмитрий", "Орлов", 28, "актер", 37000, 13000),
                            new Person("Сергей", "Иванов", 34, "тестировщик", 31000, 6000)};

        System.out.println("Масив людей");
        System.out.println(PersonMethods.toString(people));

        System.out.println("\n\n\nМасив людей отсортированый по возрасту");
        PersonMethods.sortByAge(people);
        System.out.println(PersonMethods.toString(people));

        System.out.println("\n\n\nМасив людей отсортированый по прибили");
        PersonMethods.sortByMoneyIncome(people);
        System.out.println(PersonMethods.toString(people));

        System.out.print("\n\n\nСумарная зарплата всех людей старше 30 лет: ");
        System.out.println(PersonMethods.getSalaryOfPersonsOlderThan30Years(people));
    }
}
