/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompi;

/**
 *
 * @author Taufik
 */
public class mensajes {
    String id, msg;
    mensajes(String id, String msg){
        this.id = id;
        this.msg = msg;
    }
    
    @Override
    public String toString(){
        return "Identificador: " + id + ", Mensaje: " + msg;
    }
}

