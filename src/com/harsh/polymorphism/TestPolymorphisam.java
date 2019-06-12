package com.harsh.polymorphism;

public class TestPolymorphisam {

    public static void main(String[] args) {
    Parent p=new Child2();
    if(p instanceof Child1){
        p.print();
    }

    Parent p1=new Parent();
    p1.print();
    }
}
