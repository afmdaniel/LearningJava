/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesabstratasnext;

/**
 *
 * @author DELL
 */
public interface NewInterface {
    
    public default void metodo(){
        System.out.println("estou aqui");
    }
}
