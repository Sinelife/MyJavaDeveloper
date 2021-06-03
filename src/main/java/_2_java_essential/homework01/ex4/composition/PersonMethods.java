package _2_java_essential.homework01.ex4.composition;

class PersonMethods {

    /**
     * Метод, который сортирует масив людей по денежному приходу
     */
    static void sortByMoneyIncome(Person[] people){
        for (int i = 0; i < people.length; i++) {
            for (int j = i; j < people.length; j++) {
                if(firstLessByIncome(people[i], people[j])){
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
    }

    /**
     * Метод, который определяет меньше ли доход у первого человека
     */
    private static boolean firstLessByIncome(Person first, Person second){
        return first.getSalary() + first.getBonus() < second.getSalary() + second.getBonus();
    }


    /**
     * Метод, который сортирует масив людей по возрасту
     */
    static void sortByAge(Person[] people){
        for (int i = 0; i < people.length; i++) {
            for (int j = i; j < people.length; j++) {
                if(people[i].getAge() < people[j].getAge()){
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
    }


    /**
     * Метод, который получает сумарную зарплату всех людей старше 30 лет
     */
    static int getSalaryOfPersonsOlderThan30Years(Person[] people){
        int sum = 0;
        for (Person person : people) {
            if(person.getAge() > 30){
                sum += person.getSalary();
            }
        }
        return sum;
    }




    public static String toString(Person[] people){
        String res = "";
        int counter = 0;
        for (Person person : people) {
            res += counter++ + ")" + person + "\n";
        }
        return res;
    }
}
