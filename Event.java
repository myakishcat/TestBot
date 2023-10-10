import java.util.Date;

public class Event {

    private String name;
    private Date start;
    private Date end;
    private String description;

    public Event(String name, Date start, Date end, String description){
        this.name = name;
        this.start = start;
        this.end = end;
        this.description = description;
    }

}