package academy.belhard;

import academy.belhard.entity.User;

public class Main {
    public static void main(String[] args) {
        User firstInfo = new User("Danila" , " Sagan", "EL_dranick@mail.ru", "123456");
        System.out.println(firstInfo.getFullInfo());
        System.out.println(firstInfo.getFullName());
        System.out.println(firstInfo.isPasswordCorrect("1456"));
    }
}
