public class SystemService {

    // Scrambles the password by reversing it
    public String encrypt(String data) {
        StringBuilder sb = new StringBuilder(data);
        sb.reverse(); 
        return sb.toString();
    }

    // Unscrambles it (reversing a reversed string brings it back)
    public String decrypt(String data) {
        StringBuilder sb = new StringBuilder(data);
        sb.reverse();
        return sb.toString();
    }
}