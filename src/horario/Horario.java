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
 * @author CamiloAndrés
 */
public class Horario implements Serializable{
    private final ArrayList<Materia> materias;
    public static final byte PUEDE = 0;
    public static final byte CRUZA = 1;
    public static final byte YAEXISTE = 2;

    public Horario() {
        materias = new ArrayList();
    }
    
    public void agregarMateria(Materia materiaNueva){
        if(materias==null){
            System.err.println("Objeto 'materias' nulo.");
            throw new NullPointerException();
        }
        materias.add(materiaNueva);
    }
    
    public int sumarCreditos(){
        int suma = 0;
        Materia materia;
        for (int i = 0;i<materias.size();i++){
            materia = materias.get(i);
            suma+=materia.getCreditos();
        }
        return suma;
    }
    
    public byte existe(Materia materia){
        Materia materian;
        for (int i = 0;i<materias.size();i++){
            materian = materias.get(i);
            if(materia.equals(materian)){
                return YAEXISTE;
            }
            if(materia.cruzaCon(materian)){
                return CRUZA;
            }
        }
        return PUEDE;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
}
