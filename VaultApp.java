import java.util.Scanner;

public class VaultApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Java Credential Vault v1.0 ---");
        
        // 1. Ask for the Website/Resource
        System.out.print("Enter Website/App (e.g. GitHub): ");
        String site = input.nextLine();

        // 2. Ask for the Account Name
        System.out.print("Enter Username/Email: ");
        String name = input.nextLine();

        // 3. Ask for the Password
        System.out.print("Enter Password: ");
        String pass = input.nextLine();

        // Create the object with ALL THREE pieces of info
        Credential myNewSecret = new Credential(site, name, pass);

        System.out.println("\n--- Success! ---");
        System.out.println("Resource: " + myNewSecret.websiteUrl);
        System.out.println("Identity: " + myNewSecret.accountName);
        System.out.println("Status: Saved in Memory (Unencrypted)");
        
        input.close();
    }
}