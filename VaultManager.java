import java.util.ArrayList;

public class VaultManager {
    SystemService sys = new SystemService();
    // This list will hold all our Credential objects
    private ArrayList<Credential> allCredentials = new ArrayList<>();

    // Method to add a new credential to the list
    public void addCredential(Credential c) {
        allCredentials.add(c);
        System.out.println("--- Added to Vault! Total: " + allCredentials.size() + " ---");
    }

    // Method to show everything in the vault
    public void showAll() {
        System.out.println("\n--- Your Stored Credentials ---");
        for (Credential c : allCredentials) {
            System.out.println("Site: " + c.getWebsiteUrl() + " | User: " + c.getAccountName() + " | Password :" + sys.encrypt(c.getPassword()));
        }

    }
}