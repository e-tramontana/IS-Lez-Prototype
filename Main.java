public class Main {
    public static void main(String[] args) {
        Client c = new Client(new Calendario(), new NoteBook());
        c.inserisciNote();
        c.inserisciImpegni();
        c.nuovaAgenda();
    }
}
