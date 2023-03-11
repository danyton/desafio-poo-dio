public class Smartphone extends ProdutoEletronico {
    private String sistemaOperacional;

    public Smartphone(String marca, String modelo, double preco, String sistemaOperacional) {
        super(marca, modelo, preco);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
}
