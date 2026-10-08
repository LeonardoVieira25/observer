import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private Float ultimoValor;

    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof Float))
            throw new IllegalArgumentException("Update not supported");
        this.ultimoValor = (Float) arg;
        System.out.println("Cliente " + nome + " recebeu novo valor: " +
                ultimoValor);
    }

    public Float getUltimoValor() {
        return ultimoValor;
    }
}
