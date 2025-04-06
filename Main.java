public class Main {
    public static void main(String[] args) {

        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9,  11, 2,1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29,1.68, 57.8, 14, 2,3);
        lutadores[2] = new Lutador("Dead Code", "Austrália", 28, 1.93,81.6,13,0,2);
        lutadores[3] = new Lutador("Ufocobol", "Brasil",37, 1.70, 119.3,  5, 4,3);
        lutadores[4] = new Lutador("Neraard", "EUA", 30, 1.81,105.7,  12,2,4);
        lutadores[5] = new Lutador("Dead Code", "Australia", 28,1.93,81.6,13,0, 2);

        lutadores[0].apresentar();

    }
}