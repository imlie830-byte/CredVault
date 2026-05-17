// Updated blueprint with a Resource field
public class Credential {
    private String websiteUrl;   // Which site is this for?
    private String accountName;  // Your username/email
    private String password;     // The secret

    // Update the constructor to handle three things now
    public Credential(String websiteUrl, String accountName, String password) {
        this.websiteUrl = websiteUrl;
        this.accountName = accountName;
        this.password = password;
    }

    public String getWebsiteUrl() { return this.websiteUrl; }
    public String getAccountName() { return this.accountName; }
    public String getPassword() { return this.password; }
}