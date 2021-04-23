import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void compareTo() {
        Paciente p1 = new Paciente("albedo","golpe","C");
        Paciente p2 = new Paciente("Klee","quemadura","A");

        int comparacion = p1.compareTo(p2.getPrioridad());
        boolean comprobacion = false;
        if (comparacion > 0){
            comprobacion = true;
        }

        assertTrue(comprobacion);
    }
}