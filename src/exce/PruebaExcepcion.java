/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce;

import javax.swing.JOptionPane;

   public class PruebaExcepcion{  
	
public static void main(String args[]){
//formatoNumero();
//formatoNumero1();// se imprime por consola un mensaje un error que dice No es un número, es una cadena de texto.
//desborde();
//aritmetico();
divicion();
}   

//excepción sin tratar 
public static void formatoNumero(){

int numero;   
String cadena="  1";   
    	numero = Integer.parseInt(cadena);   
  
}
  

    //excepción tratada
public static void formatoNumero1(){
 
 int numero;   
 String cadena="  1";   
 	try{   
    		numero = Integer.parseInt(cadena);   
 	}   
 catch(NumberFormatException ex){   
 System.out.println("No es un número, es una cadena de texto."+ex.getMessage());   
    
 	}   
                 }

public static void desborde(){
    //la longitud era muy corta
 
 int v[]= new int[5];   
		for(int i =0; i<5;i++){
		v[i]=i;
}                  
 	}


public static void aritmetico(){
    
  //no se puede dividir entre 0
 
int numero=5, resultado;

resultado= numero/2;
														                  
 	}

public static void divicion(){

    int x,y,res;
     Helper h=new Helper();
     
     
    y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el entero")); 
    x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"));
    
    try {
        h.validar(y);
    } catch (Exception e) {
        e.printStackTrace();
    }
   
    
     res=y/x;
     
     JOptionPane.showMessageDialog(null,"El resultado de dividir "+y+" entre "+x+" es:"+res);




}

   
   
   
   
   }



