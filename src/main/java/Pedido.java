import java.util.Observable;

@SuppressWarnings("deprecation")
public class Pedido extends Observable {
    private Float valor;

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
        setChanged();
        notifyObservers(valor);
    }
}
