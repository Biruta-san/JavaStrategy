public class Client {
    public static void main(String[] args) {
        Produto produtoNatal = new Produto("Peru", 120, new DescontoNatal());
        Produto produtoFimAno = new Produto("Champanhe", 135, new DescontoFimAno());
        Produto produtoEletronico = new Produto("Telefone", 5582, new DescontoEletronico());
        Produto produtoSemDesconto = new Produto("Novel", 124, new SemDesconto());

        System.out.println(produtoNatal.getNome() + " com desconto de Natal: " + produtoNatal.getPrecoComDesconto());
        System.out.println(produtoFimAno.getNome() + " com desconto de fim de ano: " + produtoFimAno.getPrecoComDesconto());
        System.out.println(produtoEletronico.getNome() + " com desconto para eletrônico: " + produtoEletronico.getPrecoComDesconto());
        System.out.println(produtoSemDesconto.getNome() + " sem desconto: " + produtoSemDesconto.getPrecoComDesconto());
    }    
}
