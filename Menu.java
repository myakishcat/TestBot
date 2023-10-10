public class Menu {

    static SpreadSheet events = new SpreadSheet();
    static SpreadSheet tasks = new SpreadSheet();

    static String commands = """
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

    public void talker(String answer){

        switch (answer){
            case("/help"):
                System.out.println(Menu.commands);
                break;

            case("/deadlines"):
                System.out.println("Ваши дела: ");
                tasks.printList();
                break;

            case("/schedule"):
                System.out.println("Ваше расписание: ");
                break;

            case("/newtask"):
                String[] attrs = new String[Task.format.length];
                for (int i = 0; i < Task.format.length; i++){
                    System.out.println("Введите " + Task.format[i]);
                    attrs[i] = Utils.getString();
                }
                Task newTask = new Task(attrs[0], attrs[1], attrs[2]);
                tasks.add(newTask);
                break;

            case("/deltask"):
                System.out.println("Введите номер задачи, которую вы хотите удалить");
                tasks.printList();
                tasks.del(Utils.getInt());
                break;

            case("/changetask"):
                System.out.println("Введите номер задачи, которую вы хотите изменить");
                tasks.printList();
                tasks.change(Utils.getInt());
                break;

            case("/newevent"):
                break;

            case("/delevent"):
                break;

            case("/changeevent"):
                break;

            default:
                System.out.println("Я не знаю такой команды");
        }
    }
}