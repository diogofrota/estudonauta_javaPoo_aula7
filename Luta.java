import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    // ---- Metodos Publicos --------

    public void marcarLuta(Lutador l1, Lutador l2){

        if (l1.getCategoria().equals(l2.getCategoria())  && l1 != l2 ) {
            this.setAprovada(true);
            System.out.println("A luta pode acontecer!!");

            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            System.out.println("A luta não pode acontecer!!");
            this.setAprovada(false);
            this.desafiante = null;
            this.desafiado = null;

        }

    }

    public void lutar() {
        if (this.getAprovada()) {

            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0 : // empate
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println("A luta empatou!!!");
                    break;
                case 1 : // desafiado vence
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.println("O desafiado vence!!");
                    break;
                case 2 :
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("O desafiante vence!!!");
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer!!!");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
