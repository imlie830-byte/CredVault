import java.util.Scanner;

public class VaultApp {
    public static void main(String[] args) {
        SystemService sys = new SystemService();
        Scanner input = new Scanner(System.in);
        VaultManager myManager = new VaultManager(); // Create the manager
        
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Credential");
            System.out.println("2. Show All");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.print("Website: ");
                String site = input.nextLine();
                System.out.print("Username: ");
                String user = input.nextLine();
                System.out.print("Password: ");
                String pass = input.nextLine();

                Credential c = new Credential(site, user, pass);
                myManager.addCredential(c);

            } 
            else if (choice.equals("2")) {
                myManager.showAll();

            } 
            else {
                running = false;
            }
        }
        System.out.println("Session Terminated , Thanks for using CredVault !");
        input.close();
    }
}