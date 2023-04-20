import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoedaTest {

    @Test
    void deveRetornarMoedaDolar() {
        Moeda moeda = new Moeda();
        moeda.setMoeda(50F);

        assertEquals(1, moeda.getMoeda());
    }

    @Test
    void deveRetornarMoedaReal() {
        Moeda moeda = new Moeda();
        moeda.setMoeda(5F);

        assertEquals(5, moeda.getReal());
    }
}
