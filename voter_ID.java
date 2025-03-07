import java.util.Scanner;
public class voter_ID{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("has ID(true/false): ");
        boolean ID = sc.nextBoolean();
        System.out.print("has Nationality(true/false): ");
        boolean Nationality = sc.nextBoolean();
        if(age>18 && ID==true){
            System.out.println("You are eligible to Vote");
        } 
        else {
            System.out.println("You are not eligible to Vote");
        }
    }
}
