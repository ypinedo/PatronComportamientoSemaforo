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
public class EstadoVerde extends EstadoSemaforo {

    public EstadoVerde(Semaforo objSemaforo) {
        this.objSemaforo = objSemaforo;
    }

    // -------------------------------------------
    @Override
    public void mostrar() {
        System.out.println("Luz verde, iniciar Marcha");
    }
}
