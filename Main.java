public class Main {

    public static void main(String[] args) {
        Menu bot = new Menu();

        while (true){
            System.out.println("Чем могу помочь?");
            String answer = Utils.getString();
            bot.talker(answer);
        }
    }
}