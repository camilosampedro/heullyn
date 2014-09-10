/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase en la que se almacena un conjunto de materias.
 *
 * @author CamiloAndrés
 * @see Materia
 */
public class Horario implements Serializable {

    private final ArrayList<Materia> materias;
    public static final byte PUEDE = 0;
    public static final byte CRUZA = 1;
    public static final byte YAEXISTE = 2;

    /**
     * Constructor vacío.
     */
    public Horario() {
        materias = new ArrayList();
    }

    /**
     * Agrega una materia al conjunto de materias de este horario.
     *
     * @param materiaNueva Materia a agregar.
     */
    public void agregarMateria(Materia materiaNueva) {
        if (materias == null) {
            System.err.println("Objeto 'materias' nulo.");
            throw new NullPointerException();
        }
        materias.add(materiaNueva);
    }

    /**
     * Suma los créditos de todas las materias almacenadas.
     *
     * @return Entero con la suma de los créditos.
     */
    public int sumarCreditos() {
        int suma = 0;
        Materia materia;
        for (Materia materia1 : materias) {
            materia = materia1;
            suma += materia.getCreditos();
        }
        return suma;
    }

    /**
     * Verifica si ya existe una materia con el nombre especificado.
     *
     * @param materia Materia a buscar.
     * @return Horario.EXISTE si existe, Horario.CRUZA si cruza, Horario.PUEDE
     * si no existe.
     */
    public byte existe(Materia materia) {
        Materia materian;
        for (Materia materia1 : materias) {
            materian = materia1;
            if (materia.equals(materian)) {
                return YAEXISTE;
            }
            if (materia.cruzaCon(materian)) {
                return CRUZA;
            }
        }
        return PUEDE;
    }

    /**
     * Obtener la lista de las materias.
     *
     * @return ArrayList con todas las materias en el horario.
     */
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    /**
     * Genera un String con la información dentro del horario.
     *
     * @return String con la información del horario.
     */
    @Override
    public String toString() {
        String string = "#MATERIAS:\n#\tGrupo\tNombre\n";
        for (Materia mat : materias) {
            string = string + mat.toString() + "\n";
        }
        string = string + "#RECUENTO:\nNúmero de materias: " + materias.size() + "\nCréditos: " + this.sumarCreditos();
        return string;
    }

    public void ordenarPorNombre() {
        ArrayList<Materia> auxiliar;
        for (Materia mat : materias) {
            for (Materia mat2 : materias){
                
            }
        }
    }
}
