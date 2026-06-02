package Model;

import Interfaces.Informable;
import Interfaces.Investigable;

/**
 * Representa una zona anomala.
 * Implementa Investigable e Informable ya que puede ser investigada y generar informe.
 * @author Marshall Camara
 */
public class ZonaAnomala extends CasoParanormal implements Investigable, Informable {

    private int radioAfectado;

    /**
     * Constructor de ZonaAnomala.
     * @param nombre nombre del caso
     * @param investigador investigador responsable
     * @param nivelRiesgo nivel de riesgo
     * @param radioAfectado radio afectado en metros
     */
    public ZonaAnomala(String nombre, String investigador, NivelRiesgo nivelRiesgo, int radioAfectado) {
        super(nombre, investigador, nivelRiesgo);
        this.radioAfectado = radioAfectado;
    }

    /**
     * @return el radio afectado en metros
     */
    public int getRadioAfectado() {
        return radioAfectado;
    }

    @Override
    public void investigar() {
        System.out.println("Se investigo la zona anomala: " + getNombre());
    }

    @Override
    public void generarInforme() {
        System.out.println("Informe de zona anomala: " + getNombre() + ". Radio afectado: " + radioAfectado + " metros.");
    }

    @Override
    public String toString() {
        return "ZonaAnomala [nombre=" + getNombre() + ", investigador=" + getInvestigador()
                + ", nivelRiesgo=" + getNivelRiesgo() + ", radioAfectado=" + radioAfectado + "]";
    }
}
