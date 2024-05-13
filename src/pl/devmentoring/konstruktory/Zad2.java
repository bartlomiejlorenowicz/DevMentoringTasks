package pl.devmentoring.konstruktory;

public class Zad2 {
    // Popraw poniższy kod:

    public class Dog {
//        public String name;
//        public int noLegs;
//        public int age;

        // dodanie prywatnego modyfikatora dostepu
        private String name;
        private int noLegs;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
            this.noLegs = 4;
        }

//        private void bark() {
//            System.out.println("Woof-woof!");
//        }

        // dodanie publicznego modyfikatora dostepu
        public void bark() {
            System.out.println("Woof-woof!");
        }

        // dodanie setterów i getterów
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNoLegs() {
            return noLegs;
        }

        public void setNoLegs(int noLegs) {
            this.noLegs = noLegs;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
