package _2_java_essential.homework02.ex5;

class Tester {

    public static void main(String[] args) {
        Fish fish = new Fish("Немо", 2, 1.56);
        Dog dog = new Dog("Тузик", 4);
        Parrot parrot = new Parrot("Кеша", 1);
        Game game = new Game(dog, fish, parrot);
        game.run();
    }


}
