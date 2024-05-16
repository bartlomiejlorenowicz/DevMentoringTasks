package pl.devmentoring.dziedziczenie;

public class Info {
    private static int countLog = 0;
    private static String info = "Info: “Listen carefully. We have some information regarding …”";

    public static void execute() {
        System.out.println(info);
        countLog++;
        System.out.println("Total info log: " + countLog);
    }
}
