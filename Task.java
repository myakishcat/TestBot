public class Task {
    private String name;
    private String deadline;
    private String description;
    public static String[] format = {"name", "deadline", "description"};

    public Task(String name, String deadline, String description){
        this.name = name;
        this.deadline = deadline;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print(){
        System.out.print(name + "\t");
        System.out.print(deadline + "\t");
        System.out.print(description + "\t");
    }
}