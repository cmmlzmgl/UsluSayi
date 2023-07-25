import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1,num2, total = 1;

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        num2 = input.nextInt();

        for (int i =1; i <= num2; i++)
        {
            total = total * num1;
        }
        System.out.print(num1+" üzeri "+num2+" = "+total);
    }
}
