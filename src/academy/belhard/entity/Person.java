package academy.belhard.entity;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String a, String b){
         this.firstName = a;
         this.lastName = b;
    }
    public String getFullName(){
        String fullname = firstName + " " + lastName;
    return fullname;
    }
}
