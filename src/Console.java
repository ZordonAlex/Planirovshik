import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Console {
    Methods methods = new Methods();

    public void menu() throws IOException, ParseException {
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("�������� �����:");
            System.out.println("     1. �������� ������");
            System.out.println("     2. ���������� ������");
            System.out.println("     3. ������� ������");
            System.out.println("     4. �����");
            System.out.print("������� ����� �����: ");
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
                    System.out.println("������ ����� �� ����������!");
                    break;
            }
        }
    }

}