/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
       double v[][];
       int fila;
       int columna;
       double sumamatrices= 0;
       double restamatrices= 0;
       
       
       System.out.println("Ingrese la cantidad de filas: ");
       fila = entrada.nextInt();
       
       System.out.println("Ingrese la cantidad de columnas: ");
       columna = entrada.nextInt();
       
       v= new double[fila][columna];
               
       for(int i=0;i<fila;i++)
       {
           for(int j=0;j<columna;j++)
           {
               System.out.println("Ingrese el valor para el espacio ["+i+"]["+j+"]: ");
               v[i][j] = entrada.nextDouble();
           }
       }
       System.out.println("\nLa matriz es: ");
       for(int i=0;i<fila;i++)
       {
           for(int j=0;j<columna;j++)
           {
               System.out.print(v[i][j]+"  ");
           }
           System.out.println("\n ");
       } 
       
       
        for(int i=0;i<fila;i++)
       {
           for(int j=0;j<columna;j++)
           {
               if(i == j)
               {
               sumamatrices = sumamatrices + v[i][j];
               }
               if(i + j == fila - 1 )
               {
                   sumamatrices = sumamatrices + v[i][j];
               }
           }
           System.out.println("\n ");
       } 
        System.out.println("La resta de las diagonales es: "+sumamatrices);
        for(int i=0;i<fila;i++)
       {
           for(int j=0;j<columna;j++)
           {
               if(i == j)
               {
               restamatrices = restamatrices + v[i][j];
               }
               if(i + j == fila - 1 )
               {
                   restamatrices = restamatrices - v[i][j];
               }
           }
       } 
       
        System.out.println("La resta de las diagonales es: "+restamatrices);
       
    }
    
}
