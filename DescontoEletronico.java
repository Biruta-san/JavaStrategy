public class DescontoEletronico implements IDiscontoStrategy {

  @Override
  public double aplicaDesconto(double preco) {
      // 20% de desconto para produtos eletrônicos
      return preco * 0.8;
  }
}
