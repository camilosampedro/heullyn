/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author JETZ
 */
public class Materia implements Serializable {

    private final String nombre;
    private int creditos;
    private ArrayList<Clase> clases;
    private String grupo;

    public Materia(String nombre, int creditos, String grupo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.grupo = grupo;
    }

    public void agregarClase(Clase clase) {
        clases.add(clase);
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean equals(Materia materia) {
        return materia.getCreditos() == this.creditos && materia.nombre.equals(this.nombre);
    }

    public boolean cruzaCon(Materia materia) {
        Clase clase1, clase2;
        for (int i = 0; i < materia.getClases().size(); i++) {
            clase1 = materia.getClases().get(i);
            for (int j = 0; j < materia.getClases().size(); j++) {
                clase2 = clases.get(j);
                if (clase1.cruzaCon(clase2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
