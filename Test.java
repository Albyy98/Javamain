class Animal{
}
class Dog extends Animal{
    @Override
    public String toString() {
        return "This is a Dog!";
    }
}
public class Test{
    public static void main(String []args){
        Dog myDog=new Dog();
        System.out.println(myDog);
    }
}