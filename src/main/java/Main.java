public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente("Leonardo");
        pedido.addObserver(cliente);

        pedido.setValor(100.0f);

        System.out.println("Valor do pedido: " + pedido.getValor());
        System.out.println("Valor do pedido pelo cliente: " + cliente.getUltimoValor());
    }
}
