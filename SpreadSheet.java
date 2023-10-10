import java.util.LinkedList;

public class SpreadSheet { //how to make for T not separate for Task and Event

    LinkedList<Task> list = new LinkedList<>();

    public void printList(){
        for (int i = 0; i < list.size(); i++){
            System.out.print(i+1 + ". ");
            list.get(i).print();
            System.out.println();
        }
    }

    public void add(Task object){
        list.add(object);
        System.out.println("Задача добавлена");
    }

    public void del(int num){
        if (num < 0 || num > list.size()){
            System.out.println("Некорректный номер");
        }
        else {
            list.remove(num - 1);
            System.out.println("Задача удалена");
        }
    }

    public void change(int num){
        Task task = list.get(num - 1);
        System.out.println("Введите новые данные или команду /same, чтобы оставить те же");

        for(int i = 0; i < Task.format.length; i++){
            System.out.println(Task.format[i]);
            String enter = Utils.getString();

            if (!enter.equals("/same")){
                switch (Task.format[i]) {
                    case "name" -> task.setName(enter);
                    case "deadline" -> task.setDeadline(enter);
                    case "description" -> task.setDescription(enter);
                }
            }
        }

        System.out.print("Задача изменена: ");
        task.print();
        System.out.println();
    }
}