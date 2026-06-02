package Model;

import Exceptions.CasoDuplicadoException;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona todos los casos de la agencia de investigacion paranormal.
 * Permite agregar, obtener y filtrar casos.
 * @author Marshall Camara
 */
public class AgenciaParanormal {

    private String nombre;
    private List<CasoParanormal> casos;

    /**
     * Constructor de AgenciaParanormal.
     * @param nombre nombre de la agencia
     */
    public AgenciaParanormal(String nombre) {
        this.nombre = nombre;
        this.casos = new ArrayList<>();
    }

    /**
     * @return el nombre de la agencia
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Agrega un caso a la agencia.
     * @param caso el caso a agregar
     * @throws CasoDuplicadoException si ya existe un caso con el mismo nombre e investigador
     */
    public void agregarCaso(CasoParanormal caso) throws CasoDuplicadoException {
        if (casos.contains(caso)) {
            throw new CasoDuplicadoException("Ya existe un caso con nombre '" + caso.getNombre()
                    + "' e investigador '" + caso.getInvestigador() + "'.");
        }
        casos.add(caso);
    }

    /**
     * Devuelve todos los casos registrados.
     * @return lista de casos
     */
    public List<CasoParanormal> obtenerCasos() {
        return casos;
    }

    /**
     * Filtra los casos por nivel de riesgo.
     * @param nivel nivel de riesgo a filtrar
     * @return lista de casos con ese nivel de riesgo
     */
    public List<CasoParanormal> filtrarPorRiesgo(NivelRiesgo nivel) {
        List<CasoParanormal> resultado = new ArrayList<>();
        for (CasoParanormal c : casos) {
            if (c.getNivelRiesgo() == nivel) {
                resultado.add(c);
            }
        }
        return resultado;
    }
}
