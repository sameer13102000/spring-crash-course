package com.sameer.sameer;

public class Laptop implements Computer{

    private int count;

    public Laptop(){
        System.out.println("Laptop Object Created");
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

  
    @Override
    public void compile() {
        System.out.println("Compiling from Laptop");
    }

    
}
