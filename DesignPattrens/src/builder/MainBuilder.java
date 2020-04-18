package builder;

public class MainBuilder {

    public static void main(String[] args) {
        User user = new User.UserBuilder("vivek","jadhav").age(10).build();
        System.out.println(user.toString());
    }
}
