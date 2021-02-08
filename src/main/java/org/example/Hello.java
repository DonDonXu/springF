package org.example;

public class Hello {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show(){
        System.out.println("Hello " +  name);
    }

    @Override
    public String toString(){
        return "Hello(" +
                "str=" + name ;
    }
}
