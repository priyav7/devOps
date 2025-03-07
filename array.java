import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[]num = new int[size];
        int target = scan.nextInt();
        int position = -1;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number");
            num[i] = scan.nextInt();
            
        }
        System.out.println("your values");
        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
            
        }
        for (int i = 0; i < num.length; i++) {
            if(num[i]==target){
                position = i;
                break;
            }
            if(position != -1) {
                System.out.println("The postion is:" + position);
            }
            else{
                System.out.println("Not available");
            }
            
        }
    }
}