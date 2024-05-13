package pl.devmentoring.konstruktory;

public class Zad8 {
    // Często wykorzystywaną strategią podczas tworzenia klas jest przechowywanie jednego obiektu w drugim.
    // Takie rozwiązanie nazywane jest kompozycją. Wyszukaj w zewnętrznych źródłach i dopytaj mentora, czego dotyczy tego pojęcie.
    // Wskaż w poniższym kodzie, gdzie występuje kompozycja.

    public class Company {
        private String companyName;
        private Employee[] employees;

        public Company(String companyName) {
            this.companyName = companyName;
            this.employees = new Employee[]{
                    new Employee("John", "Brick", 10, "manager"),
                    new Employee("Ann", "Smith", 5, "manager"),
                    new Employee("Jasper", "Jonathan", 10, "programmer")
            };
        }
    }
    public class Employee {
        private String name, surname;
        private int seniority;
        private String role;

        public Employee(String name, String surname, int seniority, String role) {
            this.name = name;
            this.surname = surname;
            this.seniority = seniority;
            this.role = role;
        }
    }

    // Kompozycja występuje w sytuacji, gdzie jedna klasa zawiera lub składa się z obiektów innej klasy.
    // W kompozycji obiekt klasy zawierającej ma obiekty innej klasy jako swoje pola, oznacza to, że obiekty wewnętrzne
    // są zależne od obiektu klasy zawierającej, kiedy obiekt zewnętrzny jest niszczony, obiekty wewnętrzne również są usuwane.
    // W kodzie przykładem kompozycji jest relacja między klasami Company i Employee. Gdy obiekt Company jest nieszczony, obiekty Employee również
    // przestają istnieć.


}
