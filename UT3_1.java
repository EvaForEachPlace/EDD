
import java.util.Scanner;

//Eva
public class UT3_1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);     
              
        System.out.println("TENSIÓ ARTERIAL");
        System.out.println("----------------");
        
        
        double[] matriz1 = new double [10];
        double[] matriz2 = new double [10];
        
               
         System.out.print("Introdueix les mesures: ");
           
         int SIS = -1;
         int DIS = -1;
         int contador = 0;
         
         while(contador <=9) {
             SIS= scan.nextInt();
             if(SIS != 0) {
                DIS= scan.nextInt();                 
             }
             
             if(SIS == 0 || DIS == 0){
                if(contador > 1) {
                    break;
                }
             }
             else {
                matriz1[contador] = SIS;
                matriz2[contador] = DIS;
                contador++;
             }
         }
         
         for(int i=0; i<contador; i++){
            System.out.print(matriz1[i] + " ");
             
           
         }
         System.out.print('\n');
         
         for(int j=0; j<contador; j++){
            System.out.print(matriz2[j] + " ");
            
            
            String[] menu = {" ", "Sistòlica màxima" , "Diastòlica mínima" , "Més compensada" , "Tensió mitjana" , "Eixir"};
            
            for(int k = 0; k < menu.length; k++) {
                System.out.println(k + ".-" + menu[k]);
            }
            
            
             }
            
         }
            
       
                
              
                    
                }
            
        
    
        
    
   
