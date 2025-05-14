package br.ufba.poo;

public class Relogio {
    private Display horas;
    private Display minutos;

    public Relogio(int h, int m) {
        this.horas = new Display(h, 24, "Horas");
        this.minutos = new Display(m, 60, "Minutos");
    }

    public void incrementar() {
        boolean minutosVaiDarVolta = (minutos.getValor() == 59);
        minutos.incrementar();

        if (minutosVaiDarVolta) {
            horas.incrementar();
        }
    }

    public String toString() {
        return horas.toString() + ":" + minutos.toString();
    }
}



