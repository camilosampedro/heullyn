/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase con la información de la materia. Contiene una lista de clases dictadas
 * en dicha materia.
 *
 * @see Clase
 * @author JETZ, Camilo A. Sampedro
 */
public class Materia implements Serializable {

    private String nombre;
    private int creditos;
    private ArrayList<Clase> clases;
    private ArrayList<Grupo> grupos;
    private String grupo;
    private final Color colorFondo;

    /**
     * Constructor con la información especificada.
     *
     * @param nombre Nombre de la materia a crear.
     * @param creditos Créditos que tendrá la materia a crear.
     * @param grupo Grupo de la materia
     */
    public Materia(String nombre, int creditos, String grupo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.grupo = grupo;
        this.colorFondo = new Color((int) (255 - Math.random() * 100), (int) (255 - Math.random() * 100), (int) (255 - Math.random() * 100));
    }

    /**
     * Constructor vacío.
     */
    public Materia() {
        grupos = new ArrayList();
        //clases = new ArrayList();
        this.colorFondo = new Color((int) (Math.random() * 125), (int) (Math.random() * 125), (int) (Math.random() * 125));
    }

    /**
     * Obtiene el número de créditos de la materia actual.
     *
     * @return Número de créditos que tiene la materia actual.
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * Obtiene el nombre de la materia actual.
     *
     * @return Valor del nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el nombre a la materia actual.
     *
     * @param nombre Nombre nuevo de la materia.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna el número de créditos a la materia actual.
     *
     * @param creditos Nuevo número de créditos de la materia.
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Asigna el grupo a la materia actual.
     *
     * @param grupo Nuevo grupo de la materia.
     */
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    /**
     * Verifica si una materia es igual a otra.
     *
     * @param materia Materia con la cual comparar.
     * @return Verdadero si son iguales, falso en caso contrario.
     * @see Materia.
     */
    public boolean equals(Materia materia) {
        return materia.getCreditos() == this.creditos && materia.nombre.equals(this.nombre);
    }

    /**
     * Verifica si una materia cruza con otra. Inspecciona las clases de la
     * materia, verificando si alguna de ellas cruza.
     *
     * @param materia Materia con la cual comparar.
     * @return Verdadero si se cruzan, falso en caso contrario.
     */
    public boolean cruzaCon(Materia materia) {
        Grupo grupo1;
        for (Grupo grupo2 : materia.grupos) {
            grupo1 = grupo2;
            for (Grupo clase : this.grupos) {
                grupo2 = clase;
                if (grupo1.cruzaCon(grupo2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Genera un String con la información general de la materia.
     *
     * @return String con el grupo y el nombre de la materia.
     */
    @Override
    public String toString() {
        return ("\t" + grupo + "\t" + nombre);
    }

    /**
     * Retorna el color generado para la materia. Color generado aleatoriamente
     * y de tono claro.
     *
     * @return Color de la materia.
     * @see Color
     */
    public Color getColorFondo() {
        return colorFondo;
    }

    public ArrayList<Grupo> getGrupos() {
        return grupos;
    } 
}
