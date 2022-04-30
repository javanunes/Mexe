/*
 Dá uma mexida no mouse pra proteção de tela não fechar o computador
 */
package com;

/**
 *
 * @author ricardo
 */
public class javanunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tempoUsuario="";
        System.out.println("Microsoft Mexeitor mouse 1.2");
        try{
          tempoUsuario = args[0];
          Outro click = new Outro(tempoUsuario);
        }
       catch(ArrayIndexOutOfBoundsException e){
            Outro click = new Outro("");
        }
        
    }
    
    
    
}
