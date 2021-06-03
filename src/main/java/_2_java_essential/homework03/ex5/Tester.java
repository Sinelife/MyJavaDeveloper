package _2_java_essential.homework03.ex5;

class Tester {

    public static void main(String[] args) {
        Generator generator = new Generator();
        int size = 25_000;

//        Sortable sortService = new QuickSortService();
//        int[] ints1 = generator.getGeneratedIntegerArray(size);
//        System.out.println("Before sort: " + Arrays.toString(ints1));
//        sortService.sort(ints1);
//        System.out.println("After sort: " + Arrays.toString(ints1) + "\n");
//
//        String[] strings1 = generator.getGeneratedStringArray(size);
//        System.out.println("Before sort: " + Arrays.toString(strings1));
//        sortService.sort(strings1);
//        System.out.println("After sort: " + Arrays.toString(strings1) + "\n");
//
//        Shape[] shapes1 = generator.getGeneratedShapeArray(size);
//        System.out.println("Before sort: " + Arrays.toString(shapes1));
//        sortService.sort(shapes1);
//        System.out.println("After sort: " + Arrays.toString(shapes1) + "\n");


        TimeCounter timeCounter = new TimeCounter();
        timeCounter.outputTimeForAllSortTypes(size);

//        Cuttable service = new QuickSortService();
//        int[] array = generator.getGeneratedIntegerArray(20);
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(service.getCutted(array, 4)));
//        System.out.println(Arrays.toString(service.getCutted(array, 4, 3)));
    }
}
