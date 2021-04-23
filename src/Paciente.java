/**
 * @author Maria Isabel Solano 20504
 */
public class Paciente implements Comparable<Paciente>{

    //K serían Strings
    private final String nombre;
    private final String razon;
    private final String prioridad;

    /**
     *
     * @param nombre Nombre del paciente
     * @param razon razón por la que ingresó al hospital y necesita ser atendido
     * @param prioridad prioridad de la emergencia
     */
    public Paciente(String nombre, String razon, String prioridad) {
        this.nombre = nombre;
        this.razon = razon;
        this.prioridad = prioridad;
    }

    /**
     *
     * @return retorna un string con el nombre del paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @return retrona un string con la razón por la que fue ingresado
     */
    public String getRazon() {
        return razon;
    }

    /**
     *
     * @return retorna un string con la prioridad de la emergencia
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     *
     * @param o objeto
     * @return 0 si son iguales, -1 si es menor y 1 si el mayor
     */
    public int compareTo(String o) {
        return prioridad.compareTo((o));
    }

    /**
     *
     * @param p paciente
     * @return 0 si son iguales, -1 si es menor y 1 si es mayor
     */
    @Override
    public int compareTo(Paciente p) {
        return prioridad.compareTo(p.prioridad);
    }
}
