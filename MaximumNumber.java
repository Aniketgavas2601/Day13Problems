package com.bridgelabz.generics;

public class MaximumNumber<A extends Comparable<A>> {
    A a;
    A b;
    A c;

    MaximumNumber(A a, A b, A c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public MaximumNumber() {

    }

    public A maximum(){
        if((a.compareTo(b) > 0) && (a.compareTo(c) >0)){
          return a;
        }
        else if((b.compareTo(a) > 0) && (b.compareTo(c) > 0)){
            return b;
        }else {
            return c;
        }
    }
}
