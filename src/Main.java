public class Main {
    public static void main(String[] args) {
        Ingatlan[] ingatlanok = new Ingatlan[4];

        ingatlanok[0] = new Ingatlan("1211 Bp, Kossuth u. 4", 3, 65);
        ingatlanok[1] = new Ingatlan("3300 Eger, Dobó tér 11", 2, 45);
        ingatlanok[2] = new Ingatlan("3416 Tard, Rózsa u. 112", 1, 35);
        ingatlanok[3] = new Ingatlan("1052 Budapest, Pék u. 32", 4, 75);

        for (Ingatlan i : ingatlanok) {
            i.kiir();
        }
    }
}
