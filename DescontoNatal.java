public class DescontoNatal implements IDiscontoStrategy{

    @Override
    public double aplicaDesconto(double preco) {
        // 30% de desconto no natal
        return preco * 0.7;
    }
    
}
