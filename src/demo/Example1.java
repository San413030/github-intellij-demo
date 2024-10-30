package demo;

public class Example1 {
    public static void main(String[] args) {
        Cat c;
        c=new Cat();
        Cat b= new Cat();
        var z=new Cat();
        c.name="Sanika";
        b.name="Ashu";
        z.name="Pankya";
        c.age=18;
        b.age=9;
        z.age=12;

        System.out.println(c.name);
        System.out.println(c.age);

    }
}
