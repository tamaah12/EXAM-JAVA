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
    private Long id;
    private LocalDateTime date;
    private String startTime;
    private String endTime;
    private String room;
    private Cours course;


    public Session() {}

    public Session(LocalDateTime date, String startTime, String endTime, String room, Cours course) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.course = course;
    }
}
