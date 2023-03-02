import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ระบุจำนวนสินค้า : ");
        int n = input.nextInt();
        int i = 1;
        float sum = 0;
        do {
            System.out.println("ระบุราคาสินค้า : " +i);
            Float price = input.nextFloat();
            sum = sum + price;
            i = i + 1;
        } while ( i <= n);
        System.out.println("Total : " +sum+ " Bath");
        System.out.println("รับเงินลูกค้ามา : " );
        Float pay = input.nextFloat();
        Float change = input.nextFloat();
        change  = pay - change;
        System.out.println("ทอนเงิน : " +change+ " บาท");
    }
}
