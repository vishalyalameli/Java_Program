class PyramidPatteNumber{

public static void main(String args[] ){
  for (int i = 1 ; i<=5; i++){

for(int k= 1; k<=5-i; k++){    
  System.out.print(" ");

}
for (int j =i; j>=1; j-- ){
     System.out.print(j);

}

System.out.println("");

}

}
}

/*
    System.out.print(" ");
    System.out.print(j);

for(int k= 1; k<=5-i; k++){    
  System.out.print(" ");

}   
    
for (int j =1; j<=i; j++ ){
     System.out.print(j);

}
  


    1
   12
  123
 1234
12345

 *****************

  for (int j =i; j>=1; j-- ){
     System.out.print(j);

}


    1
   21
  321
 4321
54321

*/