package Lesson4.Bank;

/**
 * Created by freedomserg.
 */
public class BankOperations {

    public String type; //��� ��������
    public String client; //��� �������

    public void printOperation() { //����� ���� ��������
        System.out.print("Type of operation: " + type + ";" + " ");
    }

    public void printClient() { //����� ���� �������
        System.out.println("type of client: " + client);
    }

}
