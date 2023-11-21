import java.util.ArrayList;
import java.util.List;

import bean.PedidoBean;

public class menu {

    private List<Prato> pratos;
    private List<PedidoBean> pedidos;

    public menu() {
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

    public void adicionarPedido(PedidoBean pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(PedidoBean pedido) {
        pedidos.remove(pedido);
    }

    public List<PedidoBean> getPedidos() {
        return pedidos;
    }
}
