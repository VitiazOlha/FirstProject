package Lesson4.Bank;

/**
 * Created by freedomserg.
 */
public class Main {
    public static void main(String[] args) {
        BankOperations operationOne = new ActiveOperations();
        operationOne.setType("Investment loan");
        operationOne.setClient("legal entity");
        System.out.print("Type of the operation: " + operationOne.getType() + ";" + " ");
        System.out.println("client: " + operationOne.getClient());

        BankOperations operationTwo = new PassiveOperations();
        operationTwo.setType("Short-term deposit");
        operationTwo.setClient("individual");
        System.out.print("Type of the operation: " + operationTwo.getType() + ";" + " ");
        System.out.println("client: " + operationTwo.getClient());

        BankOperations operationThree = new OtherOperations();
        operationThree.setType("Payment card");
        operationThree.setClient("individual");
        System.out.print("Type of the operation: " + operationThree.getType() + ";" + " ");
        System.out.println("client: " + operationThree.getClient());
    }
}
