// public class Swastik1 {
//     public static void main(String []args){

//         for(int i = 1 ; i<=4; i++){
//             for(int j = 1; j<=8; j++){
//                 System.out.print(" ");
//             }
//             System.out.println(i);
//         }

//         for(int i = 1; i<=5; i++){
//             System.out.print(i + " ");
//         }
//             for(int i = 4; i>=1; i--){
//                   System.out.print(i  + " ");
//             }
//             System.out.println();

//             for(int i = 4; i>=1; i--){
//                 for(int j= 1; j<=8; j++ ){
//                     System.out.print( " ");
//                 }
//                 System.out.println(i);
//             }
//         }
//     }
        

public class Swastik1 {
    public static void main(String[] args) {

        // Top vertical stars (from 1 to 4)
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Middle horizontal row
        for (int i = 1; i <= 5; i++) {
            System.out.print("A" + " ");
        }
        for (int i = 4; i >= 1; i--) {
            System.out.print("B" + " ");
        }
        System.out.println();

        // Bottom vertical stars (from 4 to 1)
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 8; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
