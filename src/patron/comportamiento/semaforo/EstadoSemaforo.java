/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.comportamiento.semaforo;

/**
 *
 * @author Yurguen Pinedo
 */
public abstract class EstadoSemaforo {

    protected Semaforo objSemaforo;

    // Método que deberán crear las clases que hereden de ésta
    public abstract void mostrar();
}
