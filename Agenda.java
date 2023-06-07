import java.time.LocalDateTime;

/** Agenda è un Prototype per il design pattern Prototype. */
public interface Agenda {

    public void aggiungi(String evento, LocalDateTime data);

    public void stampa();

    public Agenda clone();
}
