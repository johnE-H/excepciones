/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exce;


public class Helper {

   Helper() {
    }

public void validar(int y)throws ExceMayor{
  
    if (y<10) {
       throw new ExceMayor("el numero es menor de 10");
    }
    



}
    
}
