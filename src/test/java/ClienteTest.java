import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    void testGetNome() {
        Cliente cliente = new Cliente("Leonardo");
        assertEquals("Leonardo", cliente.getNome());
    }

    @Test
    void testGetUltimoValor() {
        Cliente cliente = new Cliente("Leonardo");
        assertEquals(null, cliente.getUltimoValor());
    }

    @Test
    void testUpdate() {
        Cliente cliente = new Cliente("Leonardo");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente);

        pedido.setValor(100.0f);
        assertEquals(100.0f, cliente.getUltimoValor(), 0.001f);
    }

    @Test
    void shouldRejectInvalidUpdates() {
        Cliente cliente = new Cliente("Leonardo");
        try {
            cliente.update(null, "invalid");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Update not supported", e.getMessage());
        }
    }
}
