package builder;

public class User {

    private final String name;
    private final String last;
    private final int age;

    public User(UserBuilder  userBuilder) {
        this.name = userBuilder.name;
        this.last = userBuilder.last;
        this.age = userBuilder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLast() {
        return last;
    }

    public int getAge() {
        return age;
    }

    public static class UserBuilder{
        private final String name;
        private final String last;
        private int age;


        public UserBuilder(String name, String last) {
            this.name = name;
            this.last = last;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
