package pl.devmentoring.konstruktory;

public class Zad7 {
    // Czym różnią się poniższe dwa sposoby na inicjalizowanie pól w obiekcie? Który ze sposobów preferujesz i dlaczego?
    //
    //class DummyPerson {
    //    private String name;
    //    private int age;
    //    private int height;
    //    private int weight;
    //    DummyPerson(String newName, int newAge, int newHeight, int newWeight) {
    //        name = newName;
    //        age = newAge;
    //        height = newHeight;
    //        weight = newWeight;
    //    }
    //}
    //
    //vs
    //
    //class DummyPerson {
    //    private String name;
    //    private int age;
    //    private int height;
    //    private int weight;
    //    DummyPerson(String name, int age, int height, int weight) {
    //        this.name = name;
    //        this.age = age;
    //        this.height = height;
    //        this.weight = weight;
    //    }
    //}

    // Sposób drugi jest bardziej preferowalny, ponieważ wykorzystuje słowo kluczowe this, które odróżnia pola klasy od parametrów konstruktora.
    // Jest zatem bardziej czytelny, zmniejsza ryzyko błędów oraz zmniejsza ryzyko niejednoznaczności między parametrami lokalnymi a polami klasy co jest
    // szczególnie ważne w bardziej złożonych konstruktorach.
}
