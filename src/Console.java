import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Console {
    Methods methods = new Methods();

    public void menu() throws IOException, ParseException {
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Выберите опцию:");
            System.out.println("     1. Добавить задачу");
            System.out.println("     2. Посмотреть задачи");
            System.out.println("     3. Удалить задачу");
            System.out.println("     4. Выход");
            System.out.print("Введите номер опции: ");
            int operationNumber = Integer.parseInt(reader.readLine());
            switch (operationNumber) {
                case 1:
                    methods.addTask();
                    break;
                case 2:
                    methods.showTask();
                    break;
                case 3:
                    methods.removeTask();
                    break;
                case 4:
                    reader.close();
                    return;
                default:
                    System.out.println("Данной опции не существует!");
                    break;
            }
        }
    }

}