import java.util.Scanner; 
   public class proyect2 { 
     public static void main (String[]args){ 
        System.out.print(" favor ingresar a continuacion el peso del Bebe y sus meses de Nacido"); 
      try (Scanner lectura = new Scanner(System.in)){
        System.out.println("peso bebe:"); int pesoBebe = lectura.nextInt();
      
        System.out.print("meses del bebe:"); int mesesBebe = lectura.nextInt(); 
        float dosisVacuna = (float)(mesesBebe) * 8; 
         System.out.print(" se debe aplicar una dosis de vacuna de cm: "+dosisVacuna ); 

  } 

  }   
}
