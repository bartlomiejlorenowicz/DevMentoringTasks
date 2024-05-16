package pl.devmentoring.dziedziczenie;

public class Zad6 {
    // Twoim zadaniem jest odzwierciedlenie poniższego diagramu UML (to rodzina schematów przykładowo przedstawiających relacje i zawartość klas) w kodzie:
    // Uwaga:
    //Między klasą Person, a klasą Address istnieje relacja nazywana agregacją czyli sytuacja w której Person może mieć lub nie,
    // przypisany adres - w przeciwieństwie do kompozycji, gdzie do utworzenia obiektu Person konieczne byłoby przekazanie adresu.
    public static void main(String[] args) {
        Address address = new Address("100 Long street", "Amsterdam", "Noord Brabant", "4261NA", "Netherlands");
        Student student = new Student("Marco", 332245432, "marco12@wp.pl", address, 123, 4);
        student.purchaseParkingPass();
        student.getSeminarsTaken();
        student.isEligibleToEnroll();

        Professor professor = new Professor("Tom", 345678, "tom11@wp.pl", address, 7500);
        professor.purchaseParkingPass();
    }
}
