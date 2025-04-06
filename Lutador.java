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
        setPeso(p);
        this.setCategoria();
        this.vitoras = v;
        this.derrotas = d;
        this.empates = e;
    }

    // ------ Metodos Especiais ------

    public void apresentar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }

    public void status(){
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitoras());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void ganharLuta(){
        setVitoras(getVitoras() + 1);

    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);

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
        if (this.getPeso() <= 70 ) {
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
