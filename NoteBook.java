import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/** NoteBook è un ConcretePrototype per il design pattern Prototype. */
public class NoteBook implements Agenda {
    private List<String> note = new ArrayList<>();

    @Override
    public void aggiungi(String evento, LocalDateTime t) {
        note.add(evento + ", " + t.getDayOfWeek() + " " + t.getHour() + ":" + t.getMinute());
    }

    @Override
    public void stampa() {
        note.forEach(e -> System.out.println(e));
    }

    @Override
    public Agenda clone() {
        // deep copy
        List<String> n = new ArrayList<>();
        n.addAll(note);
        NoteBook notenew = new NoteBook();
        notenew.note = n;
        return notenew;
    }
}
