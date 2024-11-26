package calculadorapoo;

public class CalculadoraPOO implements ICalc {
    private double valor01 , valor02;
    
    public CalculadoraPOO(){};
    
    public CalculadoraPOO(double valor01, double valor02) {
        this.valor01 = valor01;
        this.valor02 = valor02;
    }
    
    public double getValor01() {
        return valor01;
    }

    public void setValor01(double valor01) {
        this.valor01 = valor01;
    }

    public double getValor02() {
        return valor02;
    }

    public void setValor02(double valor02) {
        this.valor02 = valor02;
    }

    
    @Override
    public double somar(double valor1, double valor2) {
        double soma = valor1 + valor2;
        return soma;
    }

    @Override
    public double subtrair(double valor1, double valor2) {
        double subtracao = valor1 - valor2;
        return subtracao; 
    }

    @Override
    public double multiplicar(double valor1, double valor2) {
        double multiplicacao = valor1 * valor2;
        return multiplicacao; 
    }

    @Override
    public double dividir(double valor1, double valor2) {
        double divisao = valor1 / valor2;
        return divisao; 
    }
    
    @Override
    public double resto(double valor1, double valor2) {
        double resto = valor1 % valor2;
        return resto; 
    }
}
