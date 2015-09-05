package Lesson4.Bank;

/**
 * Created by freedomserg.
 */
public class BankOperations {

    public String type; //вид операции
    public String client; //вид клиента

    public void printOperation() { //вывод типа операции
        System.out.print("Type of operation: " + type + ";" + " ");
    }

    public void printClient() { //вывод типа клиента
        System.out.println("type of client: " + client);
    }

}
