// Context. Executa a implementação da estratégia. Interage com client
public class Carrinho {
    private IDiscontoStrategy estrategiaDesconto;

    public void setEstrategiaDesconto(IDiscontoStrategy estrategia){
        this.estrategiaDesconto = estrategia;
    }

    public double getPrecoFinal(double preco){
        return estrategiaDesconto.aplicaDesconto(preco);
    }
}
