package generic;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Item implements Comparator<Item> {
    int age;
    String name;

    public Item() {
    }

    public Item(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (age != item.age) return false;
        return name != null ? name.equals(item.name) : item.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public int compare(Item o, Item t1) {
        if (o.age - t1.age == 0) {
            return 0;
        } else if (o.age > t1.age)
            return 1;
        else
            return -1;
    }
}

public class Test extends AbstaractTest {


    public Test(int age, String name) {
        super(age, name);
    }

    public static void main(String[] args) {
        Set<Item> treeSet = new TreeSet<Item>(new Item());
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(4, "givek"));
        treeSet.add(new Item(1, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));
        treeSet.add(new Item(14, "givek"));


        treeSet.stream().forEach(System.out::println);

    }

    @Override
    public int test(int... a) {
        return a.length;
    }
}
