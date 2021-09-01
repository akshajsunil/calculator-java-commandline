import java.util.Scanner;

public class cal {
    public static void main(String[] args){
        double a ,b;
        char op;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b= input.nextDouble();
        op = input.next().charAt(0);
        switch (op)
        {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' :System.out.println(a/b);
            break;
            default: System.out.println("Invalid operator");

        }
    }
}
