package Model;

import java.util.Objects;

/**
 * Clase abstracta que representa un caso paranormal generico.
 * Todos los tipos de casos heredan de esta clase.
 * @author Marshall Camara
 */
public abstract class CasoParanormal {

    private String nombre;
    private String investigador;
    private NivelRiesgo nivelRiesgo;

    /**
     * Constructor de CasoParanormal.
     * @param nombre nombre del caso
     * @param investigador investigador responsable
     * @param nivelRiesgo nivel de riesgo del caso
     */
    public CasoParanormal(String nombre, String investigador, NivelRiesgo nivelRiesgo) {
        this.nombre = nombre;
        this.investigador = investigador;
        this.nivelRiesgo = nivelRiesgo;
    }

    /**
     * @return el nombre del caso
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return el investigador responsable
     */
    public String getInvestigador() {
        return investigador;
    }

    /**
     * @return el nivel de riesgo del caso
     */
    public NivelRiesgo getNivelRiesgo() {
        return nivelRiesgo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof CasoParanormal c)) {
            return false;
        }
        return this.nombre.equals(c.nombre) && this.investigador.equals(c.investigador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, investigador);
    }
}
