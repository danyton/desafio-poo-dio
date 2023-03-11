public class Notebook extends ProdutoEletronico {
    private int memoria;
    private int armazenamento;

    public Notebook(String marca, String modelo, double preco, int memoria, int armazenamento) {
        super(marca, modelo, preco);
        this.memoria = memoria;
        this.armazenamento = armazenamento;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }
}
