import java.util.ArrayList;

public class Principal {
    static final ArrayList<String> comida = new ArrayList<String>();
    public Principal() {
        Consumidor consumidor = new Consumidor();
        Productor productor = new Productor();
        productor.start();
        consumidor.start();

    }
}
