import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Prato> pratos;
    private List<Pedido> pedidos;

    public Menu() {
        this.pratos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void removerPrato(Prato prato) {
        pratos.remove(prato);
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
