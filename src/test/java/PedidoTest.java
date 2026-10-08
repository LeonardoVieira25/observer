import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    void shouldNotifyAllClientsWhenValorChanges() {
        Cliente cliente1 = new Cliente("Leonardo");
        Cliente cliente2 = new Cliente("Maria");
        Pedido pedido = new Pedido();
        pedido.addObserver(cliente1);
        pedido.addObserver(cliente2);

        pedido.setValor(1f);
        pedido.setValor(100f);
        pedido.setValor(45f);

        assertEquals(45f, cliente1.getUltimoValor(), 0.001f);
        assertEquals(45f, cliente2.getUltimoValor(), 0.001f);
    }

    @Test
    void shouldBeAbleToGetAndSetValor() {
        Pedido pedido = new Pedido();
        pedido.setValor(200f);
        assertEquals(200f, pedido.getValor(), 0.001f);
    }

}
