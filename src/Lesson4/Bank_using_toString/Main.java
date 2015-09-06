package Lesson4.Bank_using_toString;

/**
 * Created by freedomserg.
 */
public class Main {
    public static void main(String[] args) {
        BankOperation operationOne = new ActiveOperation();
        operationOne.setParameters("Investment loan", "legal entity");
        System.out.println(operationOne);

        BankOperation operationTwo = new PassiveOperation();
        operationTwo.setParameters("Short-term deposit", "individual");
        System.out.println(operationTwo);

        BankOperation operationThree = new OtherOperation();
        operationThree.setParameters("Payment card", "individual");
        System.out.println(operationThree);
    }
}

