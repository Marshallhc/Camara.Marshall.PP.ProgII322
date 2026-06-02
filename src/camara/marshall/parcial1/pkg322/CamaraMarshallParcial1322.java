package camara.marshall.parcial1.pkg322;

import Exceptions.CasoDuplicadoException;
import Interfaces.Informable;
import Interfaces.Investigable;
import Model.AgenciaParanormal;
import Model.Aparicion;
import Model.CasoParanormal;
import Model.NivelRiesgo;
import Model.ObjetoMaldito;
import Model.ZonaAnomala;
import java.util.List;

/**
 * Clase principal del sistema de gestion de casos paranormales.
 * @author Marshall Camara
 */
public class CamaraMarshallParcial1322 {

    /**
     * Punto de entrada del programa.
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        AgenciaParanormal agencia = new AgenciaParanormal("Division Noche Eterna");

        try {
            agencia.agregarCaso(
                    new Aparicion("La Dama del Pasillo", "Irene Vega",
                            NivelRiesgo.CRITICO, "03:33")
            );
            agencia.agregarCaso(
                    new ObjetoMaldito("Espejo de la Habitacion 12", "Bruno Rios",
                            NivelRiesgo.MODERADO, "Vidrio antiguo")
            );
            agencia.agregarCaso(
                    new ZonaAnomala("Bosque de las Voces", "Mara Silva",
                            NivelRiesgo.BAJO, 300)
            );
            agencia.agregarCaso(
                    new ZonaAnomala("Tunel sin Retorno", "Irene Vega",
                            NivelRiesgo.CRITICO, 120)
            );
            agencia.agregarCaso(
                    new Aparicion("La Dama del Pasillo", "Irene Vega",
                            NivelRiesgo.MODERADO, "02:15")
            );
        } catch (CasoDuplicadoException e) {
            System.out.println("No se pudo agregar el caso: " + e.getMessage());
        }

        System.out.println("Casos registrados:");
        mostrarCasos(agencia.obtenerCasos());

        System.out.println();

        System.out.println("Casos investigables:");
        investigarCasos(agencia.obtenerCasos());

        System.out.println();

        System.out.println("Informes generados:");
        generarInformes(agencia.obtenerCasos());

        System.out.println();

        System.out.println("Casos de riesgo CRITICO:");
        mostrarCasos(agencia.filtrarPorRiesgo(NivelRiesgo.CRITICO));
    }

    /**
     * Muestra todos los casos de la lista.
     * @param casos lista de casos a mostrar
     */
    private static void mostrarCasos(List<CasoParanormal> casos) {
        for (CasoParanormal c : casos) {
            System.out.println(c);
        }
    }

    /**
     * Investiga los casos que implementan Investigable.
     * @param casos lista de casos a procesar
     */
    private static void investigarCasos(List<CasoParanormal> casos) {
        for (CasoParanormal c : casos) {
            if (c instanceof Investigable i) {
                i.investigar();
            } else {
                System.out.println("El caso '" + c.getNombre() + "' no puede investigarse.");
            }
        }
    }

    /**
     * Genera informes de los casos que implementan Informable.
     * @param casos lista de casos a procesar
     */
    private static void generarInformes(List<CasoParanormal> casos) {
        for (CasoParanormal c : casos) {
            if (c instanceof Informable i) {
                i.generarInforme();
            } else {
                System.out.println("El caso '" + c.getNombre() + "' no genera informe.");
            }
        }
    }
}
