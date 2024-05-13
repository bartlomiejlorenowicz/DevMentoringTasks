package pl.devmentoring.oop;

public class Student {
    private String name;
    private String lastname;
    private int age;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String lastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
