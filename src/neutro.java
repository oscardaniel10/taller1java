
    
import java.util.Scanner;

public class neutro {
    public static void main(String[]args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingresar un numero");
        int num ;
        num = lectura.nextInt();
      
        if (num>0) {
            System.out.println("el numero que ingresaste fue " +num);
            System.out.println(num + "es un numero positivo");
        } else if (num<0){
            System.out.println("el numero que ingresaste fue " +num);
            System.out.println(num + "es un numero negativo");
        } else {
            System.out.println("el numero que ingresaste fue " +num);
            System.out.println(num + "es un numero neutro");

    }
        lectura.close();
    }

}
