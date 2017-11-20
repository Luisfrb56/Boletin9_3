
package boletin9_3;

import java.util.Scanner;


public class Metodos3 {
    public void calcularArea(){
    int base,altura,Area;
    Scanner sc=new Scanner(System.in);
        System.out.println("Dame la base: ");
    base=sc.nextInt();
        System.out.println("Dame la altura: ");
    altura=sc.nextInt();
    if(base>0 && altura>0){
        Area=base*altura;
        System.out.println("El area del rectangulo es: "+Area);
    }else{
        System.out.println("Error:Numero añadido negativo");
    }
    
}
}
