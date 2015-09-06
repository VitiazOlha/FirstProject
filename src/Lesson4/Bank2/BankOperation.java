package Lesson4.Bank2;

/**
 * Created by freedomserg.
 */
public class BankOperation {

    private String type;
    private String client;

    public void setParameters(String type, String client) {
        this.type = type;
        this.client = client;
    }

    public String toString() {
        return "Type of the operation: " + type + "; " + "client: " + client;
    }
}
