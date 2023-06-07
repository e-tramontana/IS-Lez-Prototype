import java.time.LocalDateTime;

/**
 * Client chiama alcuni metodi e crea una nuova istanza tramite l'operazione
 * clone.
 */
public class Client {
    private Agenda lavoro;
    private Agenda note;
    private Agenda impegni;

    public Client(Agenda lavoro, Agenda note) {
        this.lavoro = lavoro;
        this.note = note;
    }

    public void inserisciNote() {
        note.aggiungi("Oggi è una bella giornata", LocalDateTime.now());
        note.stampa();
    }

    public void inserisciImpegni() {
        lavoro.aggiungi("lezione 1 ora in aula 2", LocalDateTime.now());
        lavoro.aggiungi("lezione 1 ora in aula 3", LocalDateTime.now().plusHours(1));
        lavoro.stampa();
    }

    public void nuovaAgenda() {
        if (impegni == null)
            impegni = lavoro.clone(); // crea nuova istanza

        impegni.aggiungi("riposo 10 minuti", LocalDateTime.now().plusMinutes(50));
        impegni.aggiungi("riposo 10 minuti", LocalDateTime.now().plusMinutes(110));

        System.out.println();
        System.out.println("impegni complessivi");
        impegni.stampa();

        System.out.println("impegni di lavoro");
        lavoro.stampa();
    }
}
