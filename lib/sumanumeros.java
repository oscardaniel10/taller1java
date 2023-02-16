import java.util.Scanner;

public class sumanumeros {
    public static void main() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingresar un numero");
        int num1;
        num1 = lectura.nextInt();
        System.out.println("ingresar otro numero");
        int num2;
        num2 = lectura.nextInt();
        if (num1 > num2) {
            System.out.println("el resultado es" + (num1 + num2));
        } else {
            System.out.println("el resultado es" + (num2 - num1));
        }

    }

}
