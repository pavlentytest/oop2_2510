package dev1;

public class Car {

    public static int wheels = 4;

    public static void doMove() {

    }

    //private, public, protected

    // модификатор доступа по умолчанию - private-package
    public String name; // null
    // public - доступно во всех пакетах

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
      //  wheels = 5;
        name = n;
    }
}
