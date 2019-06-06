public class Start {
    public static void main(String[] args)
    {
        Cat cat =new Cat("jack","黑色");
        cat.eat();
        cat.run();
        cat.sleep();

    }
}
class Animal{
    String name;
    public Animal(){}
    void sleep(){
        System.out.println(name+"正在睡觉");
    }
    void run(){
        System.out.println(name+"正在跑");
    }
}
class Cat extends Animal{
    String color;
    public Cat(String name,String color){
        this.name=name;
        this.color=color;
    }
    void eat(){
        System.out.println(color+"的"+name+"正在吃鱼");
    }
}