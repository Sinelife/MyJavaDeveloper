package _2_java_essential.homework05._2_inner_nested_classes.ex4;

class Tester {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip(
                "Millenium Falcoln",
                "Destroyer",
                new SpaceShip.Engine("Engine-Yx56", 100000, 2),
                new SpaceShip().new Weapon("Upgraded Solmaraan Desentegrator", "Desentegrator", 13, 200)
        );
        System.out.println(ship + "\n");
        ship.updateEngine();
        ship.updateEngine();
        ship.shoot(5);
        ship.shoot(100);
        ship.reloadWeapon();
        ship.shoot(10);
        System.out.println("\n" + ship);

    }

}
