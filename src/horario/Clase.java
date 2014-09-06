/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.io.Serializable;

/**
 *
 * @author CamiloAndrés
 */
public class Clase implements Serializable{

    private int horaInicio;
    private int horaFin;
    private int dia;
    private static final String[] STRDIAS
            = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    public static final byte LUNES = 0;
    public static final byte MARTES = 1;
    public static final byte MIERCOLES = 2;
    public static final byte JUEVES = 3;
    public static final byte VIERNES = 4;
    public static final byte SABADO = 5;
    public static final byte DOMINGO = 6;

    public Clase(int horaInicio, int horaFin, int dia) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public int getDia() {
        return dia;
    }

    public static String getStringDia(int dia) {
        return STRDIAS[dia];
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public boolean cruzaCon(Clase clase2) {
        if (clase2.getDia() != this.dia) {
            return false;
        }
        if (clase2.horaInicio > this.horaInicio && clase2.horaInicio < this.horaFin) {
            return true;
        }
        return clase2.horaFin < this.horaFin && clase2.horaFin > this.horaInicio;
    }
}
