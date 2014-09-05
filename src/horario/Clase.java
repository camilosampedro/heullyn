/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 *
 * @author CamiloAndrés
 */
public class Clase {

    private int horaInicio;
    private int horaFin;
    private boolean[] dias;
    private static final String[] STRDIAS
            = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};

    public Clase(int horaInicio, int horaFin, boolean[] dias) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dias = dias;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public boolean[] getDias() {
        return dias;
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

    public void setDias(boolean[] dias) {
        this.dias = dias;
    }

    public boolean cruzaCon(Clase clase2) {
        boolean cumple = true;
        cicloDias:
        for (int i = 0; i < 7; i++) {
            if (clase2.getDias()[i] == this.dias[i]) {
                cumple = true;
                break;
            }
        }
        if(!cumple){
            return false;
        }
        if (clase2.horaInicio > this.horaInicio && clase2.horaInicio < this.horaFin) {
            return true;
        }
        return clase2.horaFin < this.horaFin && clase2.horaFin > this.horaInicio;
    }
}
