import java.util.ArrayList;
import java.util.List;

public class LojaEletronicos {
    private List<ProdutoEletronico> produtos;

    public LojaEletronicos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoEletronico produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(ProdutoEletronico produto) {
        this.produtos.remove(produto);
    }

    public List<ProdutoEletronico> listarProdutos() {
        return this.produtos;
    }

    public double calcularTotalVenda() {
        double total = 0;
        for (ProdutoEletronico produto : this.produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
