import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a = scanner.nextInt();
    if(a%2==0)
    {
        System.out.println("It is even");
    }
    else{
        System.out.println("it is odd");
    }
}
}
