package br.ufba.poo;

public class Display {
    private int valor;
    private final int valorMaximo;

    public Display(int valor, int valorMaximo, String tipo) {
        if (valorMaximo <= 0) {
            throw new IllegalArgumentException("Valor máximo deve ser maior que 0");
        }

        if ("Valor".equals(tipo)) {
            if (valor < 0 || valor > valorMaximo) {
                throw new IllegalArgumentException(getMensagemErro(tipo, valorMaximo));
            }
        }

        else {
            if (valor < 0 || valor >= valorMaximo) {
                throw new IllegalArgumentException(getMensagemErro(tipo, valorMaximo));
            }
        }

        this.valor = valor;
        this.valorMaximo = valorMaximo;
    }


    public Display(int valor, int valorMaximo) {
        this(valor, valorMaximo, "Valor");
    }

    public String toString() {
        return String.format("%02d", valor);
    }

    public int getValor() {
        return valor;
    }

    public void incrementar() {
        valor++;
        if (valor >= valorMaximo) {
            valor = 0; // Realiza o wrap-around
        }
    }


    private String getMensagemErro(String tipo, int valorMaximo) {
        if ("Valor".equals(tipo)) {
            return tipo + " deve estar entre 0 e " + valorMaximo;
        } else {
            return tipo + " devem estar entre 0 e " + (valorMaximo - 1);
        }
    }
}







