import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner scn = new Scanner(System.in);//used to take the input
        
        System.out.println("Enter the first number:");
        int x = scn.nextInt();//reads the input
        
        System.out.println("Enter the second number:");
        int y = scn.nextInt();//reads the input
        
        int sum = sumFunction(x,y);
        System.out.println("Sum is " + sum);
    }
    
    public static int sumFunction(int x, int y){
        return x + y;
    }
}
