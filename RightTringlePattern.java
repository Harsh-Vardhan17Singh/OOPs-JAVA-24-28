// // import java.util.*;
//  public class pattern {
//     public static void main(String[] args) {
//         int row = 5;
//         int coloum = 10;
//         for (int i=1;i<=row;i++){
//             for(int j=1;j<=coloum;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }


public class RightTringlePattern{
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i <=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
