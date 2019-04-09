/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ldani
 */
public interface Juego {
    public abstract int[][] generar();
    public abstract int[][] generarSolucion();
    public abstract boolean comprobarSolucion();
    
}
