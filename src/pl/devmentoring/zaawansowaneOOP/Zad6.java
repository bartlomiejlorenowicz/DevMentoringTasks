package pl.devmentoring.zaawansowaneOOP;

public class Zad6 {
    // Czy poprawne jest poniższe dziedziczenie? Jak je zrefaktoryzujesz?
    //
    public abstract class OSComponent {
        public abstract void allocate();
    }

    public interface Process {
        public abstract void execute();
    }

    public class WindowsProcess extends OSComponent implements Process {
        @Override
        public void allocate() {
            // method's body
        }

        @Override
        public void execute() {
            // method's body
        }
    }

    public class LinuxProcess extends OSComponent implements Process {
        @Override
        public void allocate() {
            // method's body
        }

        @Override
        public void execute() {
            // method's body
        }
    }
}
