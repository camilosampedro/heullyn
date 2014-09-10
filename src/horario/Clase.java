/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.io.Serializable;

/**
 * Horario de una clase específica.
 *
 * @author CamiloAndrés
 */
public class Clase implements Serializable {

    private int horaInicio;
    private int horaFin;
    private final int dia;
    private static final String[] STRDIAS
            = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    public static final byte LUNES = 0;
    public static final byte MARTES = 1;
    public static final byte MIERCOLES = 2;
    public static final byte JUEVES = 3;
    public static final byte VIERNES = 4;
    public static final byte SABADO = 5;
    public static final byte DOMINGO = 6;

    /**
     * Constructor de una clase con datos ya conocidos.
     *
     * @param horaInicio Hora de inicio de la clase. Formato de 24 horas.
     * @param horaFin Hora de fin de la clase. Formato de 24 horas.
     * @param dia Día en el que se dicta la clase. Valores admitidos declarados
     * finales.
     */
    public Clase(int horaInicio, int horaFin, int dia) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.dia = dia;
    }

    /**
     * @return Hora de inicio de la clase. Formato de 24 horas.
     */
    public int getHoraInicio() {
        return horaInicio;
    }

    /**
     * @return Hora de finalización de la clase. Formado de 24 horas.
     */
    public int getHoraFin() {
        return horaFin;
    }

    /**
     * @return Día en el que se dicta la clase. Entre 0 y 6.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Convierte el dia en String.
     *
     * @param dia Día en el que se dicta la clase. Entre 0 y 6.
     * @return String del día especificado. Por ejemplo "Lunes".
     */
    public static String getStringDia(int dia) {
        return STRDIAS[dia];
    }

    /**
     * @param horaInicio Nueva hora de inicio para la clase. Formato de 24
     * horas.
     */
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @param horaFin Nueva hora de finalización de la clase. Formato de 24
     * horas.
     */
    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * Verifica si los horarios de la clase actual cruza con la clase
     * especificada. Si se interceptan los horarios en los que se dictan las
     * clases, es porque se cruzan.
     *
     * @param clase2 Clase con la que se verificará si se cruza.
     * @return Verdadero si cruzan, falso en caso contrario.
     */
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
