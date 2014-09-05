/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package horario;

/**
 *
 * @author JETZ
 */
public class Materia {

    
    private final String nombre;
    private int hInicio;
    private int hFinal;
    private int dia;
    private String grupo;
    
    public Materia(String _n,int _i,int _f,int _d,String _g){
        nombre=_n;
        hInicio=_i;
        hFinal=_f;
        dia=_d;
        grupo=_g;
    }
    public String getNombre(){
        return nombre;
    }
    public String getSalon(){
        return grupo;
    }
    public int gethInicio(){
        return hInicio;
    }
    public int gethFinal(){
        return hFinal;
    }
    public int getDia(){
        return dia;
    }
    public void sethInicio(int hInicio) {
        this.hInicio = hInicio;
    }

    public void sethFinal(int hFinal) {
        this.hFinal = hFinal;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}
