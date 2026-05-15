// Updated blueprint with a Resource field
public class Credential {
    public String websiteUrl;   // Which site is this for?
    public String accountName;  // Your username/email
    public String password;     // The secret

    // Update the constructor to handle three things now
    public Credential(String websiteUrl, String accountName, String password) {
        this.websiteUrl = websiteUrl;
        this.accountName = accountName;
        this.password = password;
    }
}