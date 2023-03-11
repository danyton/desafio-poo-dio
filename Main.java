public class Main {
    public static void main(String[] args) {
        LojaEletronicos loja = new LojaEletronicos();

        Smartphone iphone = new Smartphone("Apple", "iPhone 13 Pro", 8999.99, "iOS");
        Notebook macbook = new Notebook("Apple", "MacBook Pro", 12999.99, 16, 512);
        Notebook dell = new Notebook("Dell", "Inspiron 15", 5799.99, 8, 256);

        loja.adicionarProduto(iphone);
        loja.adicionarProduto(macbook);
        loja.adicionarProduto(dell);

        System.out.println("Produtos na loja:");
        for (ProdutoEletronico produto : loja.listarProdutos()) {
            System.out.println(produto.getMarca() + " " + produto.getModelo() + " - R$" + produto.getPreco());
        }

        System.out.println("\nTotal de venda: R$" + loja.calcularTotalVenda());
    }
}
