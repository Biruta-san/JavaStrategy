public class Produto {
  private String nome;
  private double preco;
  private IDiscontoStrategy estrategiaDesconto;

  public Produto(String nome, double preco, IDiscontoStrategy estrategiaDesconto) {
      this.nome = nome;
      this.preco = preco;
      this.estrategiaDesconto = estrategiaDesconto;
  }

  public double getPrecoComDesconto() {
      return estrategiaDesconto.aplicaDesconto(preco);
  }

  public String getNome() {
      return nome;
  }

  public double getPreco() {
      return preco;
  }
}
