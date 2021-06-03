package _2_java_essential.homework03.ex4;

class Tester {

    public static void main(String[] args) {
        Animal[] animals = AnimalGame.initializeAnimalArray();
        AnimalGame game = new AnimalGame(animals);
        game.run();
    }
}
