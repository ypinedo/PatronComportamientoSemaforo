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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo objSemaforo = new Semaforo();
        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrarAviso();
        objSemaforo.setEstado(new EstadoAmarillo(objSemaforo));
        objSemaforo.mostrarAviso();
        objSemaforo.setEstado(new EstadoVerde(objSemaforo));
        objSemaforo.mostrarAviso();
    }

}
