class CharacterPat{

public static void main(String args [] ){

  for(int i=1; i<=5; i++){
      for(int j=1; j<=i ; j++){
      System.out.print((char) (96 +i));
}

System.out.println("");

}
}
}



/*
     System.out.print((char) (96 +j));
a
ab
abc
abcd
abcde

      System.out.print((char) (96 +i));

a
bb
ccc
dddd
eeeee

*/