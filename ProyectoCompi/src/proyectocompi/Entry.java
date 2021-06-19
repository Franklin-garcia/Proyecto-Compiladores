/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompi;

/**
 *
 * @author franklin-garcia
 */
public class Entry {

    String id, tipo, ambito;
    int offset;
    int parametros = 0;
    boolean activo;
    String descriptor = "";

    Entry(String i, String t, String a, int o, boolean bool) {
        id = i;
        tipo = t;
        ambito = a;
        offset = o;
        activo = bool;
    }
}
