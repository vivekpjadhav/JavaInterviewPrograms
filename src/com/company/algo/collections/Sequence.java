package com.company.algo.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Sequence implements Iterable<Integer> {
   final  int start , increment , limit;

    public Sequence(int start, int increment, int limit) {
        this.start = start;
        this.increment = increment;
        this.limit = limit;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequanceIterator(this);
    }

    public static void main(String[] args) {
        for(Integer i : new Sequence(1,5,100)){
            System.out.println(i);
        }
    }
}

class SequanceIterator implements Iterator<Integer>{
    private  Sequence sequence;
    private int nextValue;

    public SequanceIterator(Sequence sequence) {
        this.sequence = sequence;

    }

    @Override
    public boolean hasNext() {
        return this.nextValue <= this.sequence.limit;
    }

    @Override
    public Integer next() {
        if(this.sequence.limit <this.nextValue){
            throw new NoSuchElementException("exception");
        }
        int rv = this.nextValue;
        this.nextValue += this.sequence.increment;
        return rv;
    }

}
