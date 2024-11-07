public class DescontoFimAno implements IDiscontoStrategy{

    @Override
    public double aplicaDesconto(double preco) {
        // 15% de desconto no fim de ano
        return preco * 0.85;
    }
    
}
