package p02_ExtendedDataBase;

public class Person {

    private int id;
    private String name;


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object getUsername() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }
}
