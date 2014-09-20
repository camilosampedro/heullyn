/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package horario;

import java.util.ArrayList;

/**
 *
 * @author camilo
 */
public class Grupo {
    private ArrayList<Clase> clases;
    private String grupo;
    
    public Grupo(){
        clases = new ArrayList();
    }

    /**
     * Agrega la clase especificada a la materia actual.
     *
     * @param clase Clase a insertar.
     * @see Clase
     */
    public void agregarClase(Clase clase) {
        clases.add(clase);
    }

    /**
     * Obtiene la lista de clases de la materia actual.
     *
     * @return Lista con todas las clases de la materia actual.
     * @see ArrayList
     */
    public ArrayList<Clase> getClases() {
        return clases;
    }
    
    /**
     * Obtiene el grupo asignado a la materia actual.
     *
     * @return String del grupo de la materia actual.
     */
    public String getGrupo() {
        return grupo;
    }

    boolean cruzaCon(Grupo grupo2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
