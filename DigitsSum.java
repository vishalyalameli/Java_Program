class DigitsSum
{

public static void main(String[] args)
{
  int num = 12045, sum = 0 , rem = 0 ,temp;
   temp = num;
  
  while(num > 0 )
{
rem = num %10;
sum = rem + sum;
num = num / 10;
}
 

 System.out.println("The Sum of "+temp+" Number are :"+ sum);
}
}

/*The Sum of 12045 Number are :12*/