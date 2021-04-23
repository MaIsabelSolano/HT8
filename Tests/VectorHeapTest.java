import org.junit.jupiter.api.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.*;

class VectorHeapTest {

    @Test
    void add() {
        VectorHeap<String> vh = new VectorHeap();
        //Paciente p1 = new Paciente("Albedo","accidente en laboratorio","B");

        vh.add("Jojo");

        assertFalse(vh.isEmpty());
    }

    @Test
    void add2(){
        VectorHeap<Paciente> vh = new VectorHeap<>();
        Paciente p1 = new Paciente("Albedo","accidente en laboratorio","B");

        vh.add(p1);

        assertFalse(vh.isEmpty());

    }

    @Test
    void getFirst() {
        VectorHeap<Paciente> vh = new VectorHeap<>();
        Paciente p1 = new Paciente("Albedo","accidente en laboratorio","B");

        vh.add(p1);

        assertEquals(p1,vh.getFirst());
    }

    @Test
    void remove() {
    }
}