package pl.devmentoring.dziedziczenie;

public class Warning {
    private static int countLog = 0;
    private static String warning = "Warning: “Watch out! Warning here!”";


    public static void execute() {
        countLog++;
        System.out.println(warning);
        System.out.println("Total warning log: " + countLog);
    }
}

