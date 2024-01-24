import java.util.Scanner;

class Check_Equal{
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        n = sc.nextInt();
        System.out.println("Enter the second number");
        m = sc.nextInt();
        if(m==n){
            System.out.println("Both numbers are equal");
        }
        else {
            System.out.println("The enterd numbers are not equal");
        }
    }
}