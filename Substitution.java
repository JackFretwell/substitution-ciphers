public abstract class Substitution implements Cipher {
    
    public abstract char encrypt(char c);
    
    public abstract char decrypt(char c);

    public String encrypt(String plaintext){
        char[] plainArray = plaintext.toCharArray();
        String encrypted = "";
        for(int i = 0; i < plaintext.length(); i++){
            encrypted = encrypted + encrypt(plainArray[i]);
        }
        return encrypted;
    }

    public String decrypt(String plaintext){
        char[] plainArray = plaintext.toCharArray();
        String decrypted = "";
        for(int i = 0; i < plaintext.length(); i++){
            decrypted = decrypted + decrypt(plainArray[i]);
        }
        return decrypted;
    }
}
