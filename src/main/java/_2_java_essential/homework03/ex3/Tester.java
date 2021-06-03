package _2_java_essential.homework03.ex3;

class Tester {
    public static void main(String[] args) {
        Human oleg = new Human("Олег", "Сержан", 100000, "мужчина");
        Human yaroslav = new Human("Ярослав", "Сержан", 99999, "мужчина");

        Tornado tornado1 = new Tornado(4, 120);
        Tornado tornado2 = new Tornado(6, 220);

        Car mersedes = new Car("Mersedes","Mercedes-Benz",33000);
        Car hyundai = new Car("Hyundai", "Hyundai-Accent",28000);


        oleg.move();
        yaroslav.move("Херсон");
        oleg.eat("суши");
        yaroslav.eat();
        oleg.jump();
        yaroslav.jump();
        System.out.println("\n\n");


        mersedes.move();
        hyundai.move("Харьков");
        mersedes.eat("92");
        hyundai.eat();
        System.out.println("\n\n");


        tornado1.move();
        tornado2.move("Херсон");
    }
}
