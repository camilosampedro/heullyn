/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author camilo
 */
public class Grupo {

    private Materia materia;
    private ArrayList<Clase> clases;
    private String grupo;
    
    public Grupo() {
        clases = new ArrayList();
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
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

    public boolean cruzaCon(Grupo grupo2) {
        for (Clase clase : clases) {
            for (Clase clase2 : grupo2.getClases()){
                if(clase.cruzaCon(clase2)){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Asigna el grupo a la materia actual.
     *
     * @param grupo Nuevo grupo de la materia.
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        String texto = "Grupo: " + grupo;
        for (Clase clase : clases){
            texto = texto + "\n" + clase.toString();
        }
        return texto;
    }

    public String aCheckBox() {
        return "<" + this.grupo + "> " + this.materia.getNombre();
    }
}
