public class Paciente<K extends Comparable<K>> implements Comparable<K>{

    //K serían Strings
    private K nombre;
    private K razon;
    private K prioridad;

    public Paciente(K nombre, K razon, K prioridad) {
        this.nombre = nombre;
        this.razon = razon;
        this.prioridad = prioridad;
    }

    public K getNombre() {
        return nombre;
    }

    public K getRazon() {
        return razon;
    }

    public K getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(K o) {
        return prioridad.compareTo((o));
    }

}
