package demo;

class Cat {
    String name;
    int age;

    Cat(){
        System.out.println("This default constructor gets called");
    }

    void sayMeow(){
        System.out.println("Meow! My name is "+ this.name);
    }

}
