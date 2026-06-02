package Exceptions;

/**
 * Excepcion chequeada que se lanza cuando se intenta agregar un caso que ya existe.
 * @author Marshall Camara
 */
public class CasoDuplicadoException extends Exception {

    /**
     * Constructor que recibe un mensaje descriptivo.
     * @param mensaje descripcion del error
     */
    public CasoDuplicadoException(String mensaje) {
        super(mensaje);
    }
}
