public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoras;
    private int derrotas;
    private int empates;

    public Lutador(String n, String nc, int i, double a, double p, int v, int d, int e) {
        this.nome = n;
        this.nacionalidade = nc;
        this.idade = i;
        this.altura = a;
        this.peso = p;
        this.setCategoria();

        this.vitoras = v;
        this.derrotas = d;
        this.empates = e;
    }

    // ------ Metodos Especiais ------

    public void apresentar() {

    }

    public void status(){

    }

    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatarLuta(){

    }

    // ----- Metodos GET e SET --------


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 70 ) {
            this.categoria = "leve";
        } else if ( this.getPeso() >= 71  &&  this.getPeso() < 90) {
            this.categoria = "Medio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public int getVitoras() {
        return vitoras;
    }

    public void setVitoras(int vitoras) {
        this.vitoras = vitoras;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
