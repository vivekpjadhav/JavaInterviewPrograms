package iterator;

import java.util.Iterator;

public class TryMyList {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("vivek");
        list.add("vivek2");
        list.add("vivek3");
        list.add("vivek4");

        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println("> "+it.next());
        }

        for(String s: list){
            System.out.println("-"+s);
        }
        Iterator<String> itOne = list.iterator();
        Iterator<String> itTwo = list.iterator();
        System.out.println(itOne.hasNext() ? itOne.next():"l1 is finid=shed");
        System.out.println(itTwo.hasNext() ? itTwo.next():"l2 is finid=shed");
        System.out.println(itOne.hasNext() ? itOne.next():"l1 is finid=shed");
        System.out.println(itTwo.hasNext() ? itTwo.next():"l2 is finid=shed");
        System.out.println(itOne.hasNext() ? itOne.next():"l1 is finid=shed");
        System.out.println(itTwo.hasNext() ? itTwo.next():"l2 is finid=shed");
        System.out.println(itOne.hasNext() ? itOne.next():"l1 is finid=shed");
        System.out.println(itTwo.hasNext() ? itTwo.next():"l2 is finid=shed");
        System.out.println(itOne.hasNext() ? itOne.next():"l1 is finid=shed");
        System.out.println(itTwo.hasNext() ? itTwo.next():"l2 is finid=shed");

    }
}
