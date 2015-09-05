package Lesson4.Bank;

/**
 * Created by freedomserg.
 */
public class Main {
    public static void main (String[]args) {
        ActiveOperations operation1 = new ActiveOperations();
        operation1.type = "investment loan";
        operation1.client = "legal entity";
        operation1.printOperation();
        operation1.printClient();

        PassiveOperations operation2 = new PassiveOperations();
        operation2.type = "short-term deposit";
        operation2.client = "individual";
        operation2.printOperation();
        operation2.printClient();

        OtherOperations operation3 = new OtherOperations();
        operation3.type = "payment card";
        operation3.client = "individual";
        operation3.printOperation();
        operation3.printClient();
    }
}
