package BuilderDesignPattern;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserName("Abu Bakar")
                .setUserEmail("abubakar@gmail.com")
                .setAddress("Lahore")
                .build();
        System.out.println(user);
    }
}
