import java.util.Scanner;
public class Exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int n = input.nextInt();
        int odd = 0, even = 0; 
        for(int x = 0; x < n; x++){
            int i = input.nextInt();
            if (i % 2 == 1) {
                odd = odd + 1;
            } else {
                even = even + 1;
            }
        }
        System.out.println("number of even number : " + even);
        System.out.println("number of odd number : " +odd);
    }
}
