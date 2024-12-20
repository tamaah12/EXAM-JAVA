package core.entities;

import java.time.LocalDateTime;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Session {
    private Long id; // ID de la session
    private LocalDateTime date; // Date de la session
    private String startTime; // Heure de début
    private String endTime; // Heure de fin
    private String room; // Salle de la session (peut être null si en ligne)
    private Cours course; // Cours associé à la session

    // Constructeur
    public Session() {}

    public Session(LocalDateTime date, String startTime, String endTime, String room, Cours course) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.course = course;
    }
}
