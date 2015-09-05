package Lesson4.Bank;

/**
 * Created by freedomserg.
 */
public class Main{
    public static void main(String[] args) {
        BankOperations operation_one = new ActiveOperations();
        operation_one.setType("Investment loan");
        System.out.println(operation_one.getType());



    }
}
