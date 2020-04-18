package iterator;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private class MyArrayListIterator implements Iterator<E>{
        private int progress =0;
        @Override
        public boolean hasNext() {
            return progress < count;
        }

        @Override
        public E next() {
            return data[progress++];
        }
    }

    @SuppressWarnings("unckecked")
    private E[] data = (E[])(new Object[10]);
    private int count = 0;
    @Override
    public boolean add(E e) {
        data[count++] = e;
        return true;
    }
    @Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }
    @Override
    public ListIterator<E> listIterator() {
        return null;
    }


    @Override
    public String toString() {
        return "iterator.MyArrayList{" +
                "data=" + Arrays.toString(data) +
                ", count=" + count +
                '}';
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }



    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E e) {
        return null;
    }

    @Override
    public void add(int i, E e) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }


    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List<E> subList(int i, int i1) {
        return null;
    }
}
