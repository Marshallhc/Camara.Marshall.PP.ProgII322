package Model;

import Interfaces.Informable;

/**
 * Representa un objeto maldito.
 * Implementa Informable ya que puede generar un informe.
 * @author Marshall Camara
 */
public class ObjetoMaldito extends CasoParanormal implements Informable {

    private String materialPrincipal;

    /**
     * Constructor de ObjetoMaldito.
     * @param nombre nombre del caso
     * @param investigador investigador responsable
     * @param nivelRiesgo nivel de riesgo
     * @param materialPrincipal material del que esta hecho el objeto
     */
    public ObjetoMaldito(String nombre, String investigador, NivelRiesgo nivelRiesgo, String materialPrincipal) {
        super(nombre, investigador, nivelRiesgo);
        this.materialPrincipal = materialPrincipal;
    }

    /**
     * @return el material principal del objeto
     */
    public String getMaterialPrincipal() {
        return materialPrincipal;
    }

    @Override
    public void generarInforme() {
        System.out.println("Informe de objeto maldito: " + getNombre() + ". Material principal: " + materialPrincipal + ".");
    }

    @Override
    public String toString() {
        return "ObjetoMaldito [nombre=" + getNombre() + ", investigador=" + getInvestigador()
                + ", nivelRiesgo=" + getNivelRiesgo() + ", materialPrincipal=" + materialPrincipal + "]";
    }
}
