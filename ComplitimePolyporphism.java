class Calculator{
  
int add(int a , int b)
{
    return a + b;
}

int add(int a ,int c , int b){
   return a + b + c;
}

double add( double a, double b){
  return a + b;
}
}

public class ComplitimePolyporphism{

public static void main(String [] args)
{
   Calculator cal  = new Calculator();

  System.out.println("sum of  10 and 20: " + cal.add(10,20));
  System.out.println("sum of  15 and 20: " + cal.add(15, 10,20));
System.out.println("Sum of 20.5 and 2.0: " + cal.add(20.5, 2.0));
}
}


 
