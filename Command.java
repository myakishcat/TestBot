public class Command {

    private static final String COMMAND_LIST = """
            Список команд бота:\s
            /help - вывод справки по командам
            /deadlines - вывод имеющихся заданий
            /schedule - вывод запланированных мероприятий
            /newtask - добавить новую задачу
            /deltask - удалить задачу
            /changetask - изменить детали задания
            /newevent - запланировать новое мероприятие
            /delevent - удалить мероприятие
            /changeevent - изменить детали мероприятия
            """;

    public static void help(){
        System.out.println(COMMAND_LIST);
    }

    public static void deadlines(){
        System.out.println("Ваши задачи: ");
        Main.tasks.printList();
    }

    public static void schedule(){
        System.out.println("Ваше расписание: ");
        Main.events.printList();
    }

    public static void newTask(){
        String[] taskAttrs = new String[Task.format.length];
        for (int i = 0; i < Task.format.length; i++){
            System.out.println("Enter the " + Task.format[i]);
            taskAttrs[i] = Utils.getString();
        }
        Task newTask = new Task(taskAttrs[0], taskAttrs[1], taskAttrs[2]);
        Main.tasks.add(newTask);
    }

    public static void delTask(){
        System.out.println("Введите номер задачи, которую вы хотите удалить");
        Main.tasks.printList();
        Main.tasks.del(Utils.getInt());
    }
    public static void changeTask(){
        System.out.println("Введите номер задачи, которую вы хотите изменить");
        Main.tasks.printList();
        Main.tasks.change(Utils.getInt());
    }
    public static void newEvent(){
        String[] eventAttrs = new String[Event.format.length];
        for (int i = 0; i < Event.format.length; i++){
            System.out.println("Enter the " + Event.format[i]);
            eventAttrs[i] = Utils.getString();
        }
        Event newEvent = new Event(eventAttrs[0], eventAttrs[1], eventAttrs[2], eventAttrs[3]);
        Main.events.add(newEvent);
    }
    public static void delEvent(){
        System.out.println("Введите номер мероприятия, которое вы хотите удалить");
        Main.events.printList();
        Main.events.del(Utils.getInt());
    }
    public static void changeEvent(){
        System.out.println("Введите номер мероприятия, которое вы хотите изменить");
        Main.events.printList();
        Main.events.change(Utils.getInt());
    }
}