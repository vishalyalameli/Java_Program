class OddPyramidNum{

public static void main(String [] args){

 for(int i = 4 ; i>=1; i--){
for(int k= 1; k<=4-i; k++ ){

  System.out.print(" ");
}
  for( int  j =1 ; j<= 2*i-1; j++){
    System.out.print(j);
}
 System.out.println(" ");
}

}


}


/*
 for(int k= 1; k<=4-i; k++ )

for( int  j =1 ; j<= 2*i-1; j++)

   1
  1 2 3
 1 2 3 4 5
1 2 3 4 5 6 7



   1
  123
 12345
1234567


          for(int i = 4 ; i>=1; i--)


1234567
 12345
  123
   1

*/