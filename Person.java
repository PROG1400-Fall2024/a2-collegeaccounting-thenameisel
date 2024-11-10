public class Person {
    //variables
    private String name;
    private String address;

    //constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //methods
    public String toString(){
        return "There is a person named " + name + " who lives at " + address + ".";
    }
}
