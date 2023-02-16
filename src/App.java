import java.util.Scanner; 

public class App { 

 public static void main (String[]args){ 

 System.out.print(" favor ingresar los grados a convertir    "); 

 try (Scanner lectura = new Scanner (System.in)) { 

 float grados = Float.parseFloat(lectura.nextLine()); 

float centigrados = (float) ((grados-32)/1.8); 

 System.out.print(" "+grados+"°fahrenheit es igual a "+centigrados+"°centigrados"); 

} catch (NumberFormatException e) { 
 
 } 
} 

 public App() { 

 } 

} 