package Model;

import Interfaces.Investigable;

/**
 * Representa una aparicion paranormal.
 * Implementa Investigable ya que puede ser investigada.
 * @author Marshall Camara
 */
public class Aparicion extends CasoParanormal implements Investigable {

    private String horarioFrecuente;

    /**
     * Constructor de Aparicion.
     * @param nombre nombre del caso
     * @param investigador investigador responsable
     * @param nivelRiesgo nivel de riesgo
     * @param horarioFrecuente horario en que suele manifestarse
     */
    public Aparicion(String nombre, String investigador, NivelRiesgo nivelRiesgo, String horarioFrecuente) {
        super(nombre, investigador, nivelRiesgo);
        this.horarioFrecuente = horarioFrecuente;
    }

    /**
     * @return el horario frecuente de manifestacion
     */
    public String getHorarioFrecuente() {
        return horarioFrecuente;
    }

    @Override
    public void investigar() {
        System.out.println("Se investigo la aparicion: " + getNombre());
    }

    @Override
    public String toString() {
        return "Aparicion [nombre=" + getNombre() + ", investigador=" + getInvestigador()
                + ", nivelRiesgo=" + getNivelRiesgo() + ", horarioFrecuente=" + horarioFrecuente + "]";
    }
}
