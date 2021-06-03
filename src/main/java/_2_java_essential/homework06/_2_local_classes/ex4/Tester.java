package _2_java_essential.homework06._2_local_classes.ex4;

class Tester {
    public static void main(String[] args) {
        /**EX3*/
        LocalClassesService service = new LocalClassesService();
        System.out.println(service.getObjectInfo(100));
        System.out.println(service.getObjectInfo(10.98));
        System.out.println(service.getObjectInfo('P'));
        System.out.println(service.getObjectInfo("Qwert"));
        System.out.println(service.getObjectInfo(true));
        System.out.println("\n\n\n\n");
    }
}
