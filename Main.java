public class Main {

    final static EventList events = new EventList();
    final static TaskList tasks = new TaskList();

    public static void main(String[] args) {
        while (true){
            System.out.println("Чем могу помочь?");
            String answer = Utils.getString();

            switch (answer){
                case "/help" -> Command.help();
                case "/deadlines" -> Command.deadlines();
                case "/schedule" -> Command.schedule();
                case "/newtask" -> Command.newTask();
                case "/deltask" -> Command.delTask();
                case "/changetask" -> Command.changeTask();
                case "/newevent" -> Command.newEvent();
                case "/delevent" -> Command.delEvent();
                case "/changeevent" -> Command.changeEvent();
                default -> System.out.println("Я не знаю такой команды");
            }

        }
    }
}