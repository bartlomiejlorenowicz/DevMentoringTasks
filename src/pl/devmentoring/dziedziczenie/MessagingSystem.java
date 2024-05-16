package pl.devmentoring.dziedziczenie;

public class MessagingSystem {

    private static int totalExecutions = 0;

    public void showWarning() {
        Warning.execute();
        totalExecutions++;
        System.out.println("Total execute calls: " + totalExecutions);
    }

    public void showInfo() {
        Info.execute();
        totalExecutions++;
        System.out.println("Total execute calls: " + totalExecutions);
    }
}
