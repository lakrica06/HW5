package academy.belhard.entity;

public class User extends Person {
    String email;
    String password;


    public User(String a, String b, String c, String d) {
        super(a, b);
        this.email = c;
        this.password = d;
    }

    public String getFullInfo() {
        String fullinfo = "E-mail: " + email + "\n" + "Имя: " + " " + super.firstName + super.lastName;
        return fullinfo;
    }

    public boolean isPasswordCorrect(String l) {

        if (this.password.equals(l)) {
            return true;
        } else
            return false;
    }

}



