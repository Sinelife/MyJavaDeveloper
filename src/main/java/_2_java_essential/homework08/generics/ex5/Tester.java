package _2_java_essential.homework08.generics.ex5;

class Tester {
    public static void main(String[] args) {
        SortService service = new SortService();
        service.outputAllTables(1_000, 10_000, 20_000);
    }
}
