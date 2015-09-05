package Lesson4.Bank;

/**
 * Created by freedomserg.
 */
public class Main{
    public static void main(String[] args) {
        BankOperations operation_one = new ActiveOperations();
        operation_one.setType("Investment loan");
        operation_one.setClient("legal entity");
        System.out.print("Type of the operation: " + operation_one.getType() + ";" + " ");
        System.out.println("client: " + operation_one.getClient());

        BankOperations operation_two = new PassiveOperations();
        operation_two.setType("Short-term deposit");
        operation_two.setClient("individual");
        System.out.print("Type of the operation: " + operation_two.getType() + ";" + " ");
        System.out.println("client: " + operation_two.getClient());

        BankOperations operation_three = new OtherOperations();
        operation_three.setType("Payment card");
        operation_three.setClient("individual");
        System.out.print("Type of the operation: " + operation_three.getType() + ";" + " ");
        System.out.println("client: " + operation_three.getClient());
    }
}
