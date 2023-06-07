import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/** Calendario è un ConcretePrototype per il design pattern Prototype. */
public class Calendario implements Agenda {
    private Map<LocalDateTime, String> cal = new HashMap<>();

    @Override
    public void aggiungi(String evento, LocalDateTime time) {
        if (cal.putIfAbsent(time, evento) != null)
            System.out.println("Un evento è già presente per la data e l'orario scelto");
    }

    @Override
    public void stampa() {
        cal.keySet().stream().sorted().forEach(e -> System.out.println(e.getHour() + ":" + e.getMinute() + " " +
                cal.get(e)));
    }

    @Override
    public Agenda clone() {
        // deep copy
        Map<LocalDateTime, String> m = new HashMap<>();
        m.putAll(cal);
        Calendario cnew = new Calendario();
        cnew.cal = m;
        return cnew;
    }
}
