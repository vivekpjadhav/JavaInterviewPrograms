package generic;

public abstract class AbstaractTest {
    int age;
    String name ;

    public AbstaractTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract int test(int ...a );

}
