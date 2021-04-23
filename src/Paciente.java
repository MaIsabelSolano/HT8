public class Paciente<K> implements Comparable<K>{

    //K serían Strings
    //T serían char
    private K nombre;
    private K razon;
    private Character prioridad;

    public Paciente(K nombre, K razon, Character prioridad) {
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

    public char getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Character o) {
        return prioridad.compareTo((o));
    }

    @Override
    public int compareTo(K o) {
        return 0;
    }
}
