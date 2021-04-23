public class Paciente implements Comparable<Paciente>{

    //K serían Strings
    private String nombre;
    private String razon;
    private String prioridad;

    public Paciente(String nombre, String razon, String prioridad) {
        this.nombre = nombre;
        this.razon = razon;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRazon() {
        return razon;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public int compareTo(String o) {
        return prioridad.compareTo((o));
    }

    @Override
    public int compareTo(Paciente p) {
        return prioridad.compareTo(p.prioridad);
    }
}
