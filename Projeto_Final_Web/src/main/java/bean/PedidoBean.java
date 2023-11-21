package bean;

import java.util.Date;

public class PedidoBean {

    private Integer id;
    private Date data;
    private Integer entrada;
    private Integer principal;
    private Integer sobremesa;

    public PedidoBean() {
    }

    public PedidoBean(Integer id, Date data, Integer entrada, Integer principal, Integer sobremesa) {
        this.id = id;
        this.data = data;
        this.entrada = entrada;
        this.principal = principal;
        this.sobremesa = sobremesa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getEntrada() {
        return entrada;
    }

    public void setEntrada(Integer entrada) {
        this.entrada = entrada;
    }

    public Integer getPrincipal() {
        return principal;
    }

    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }

    public Integer getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(Integer sobremesa) {
        this.sobremesa = sobremesa;
    }
}
