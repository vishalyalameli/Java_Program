class Animal{
     public void makeSound(){
  System.out.println("make sound Public");
}
}
 
class Dog extends Animal{

  public void makeSound(){
  System.out.println("Bark");
}
}

class Cat extends Animal{
  public void makeSound(){

System.out.println("Maow");

}
}

public class RuntimePolymorphism{

 public static void main(String [] args){

  Animal myAnimal;

 myAnimal= new Dog();
myAnimal.makeSound();

myAnimal= new Cat();
myAnimal.makeSound();
}
}





 