/** 
 * 
 * @author Jack Fretwell
 * @version 1.0
 */
 
public abstract class Substitution implements Cipher {

    /**
     * A character encryption method to be implemented by Substitutions children.
     * 
     * @param c represents the character to be encrypted.
     * @return c the encrypted character.
     */

    public abstract char encrypt(char c);

    /**
     * A character decryption method to be implemented by Substitutions children.
     * 
     * @param c represents the character to be decrypted.
     * @return c the decrypted character.
     */

    public abstract char decrypt(char c);

    /**
     * A method that seperates a string into it's characters.
     * 
     * It then uses an encrypt method on these characters, storing them in a string which represents the encrypted plaintext.
     * 
     * @param plaintext represents a string to be encrypted.
     * @return encrypted the encrypted string
     */

    public String encrypt(String plaintext){
        char[] plainArray = plaintext.toCharArray();
        String encrypted = "";
        for(int i = 0; i < plaintext.length(); i++){
            encrypted = encrypted + encrypt(plainArray[i]);
        }
        return encrypted;
    }

    /**
     * A method that seperates a string into it's characters.
     * 
     * It then uses a decrypt method on these characters, storing them in a string which represents the decrypt plaintext.
     * 
     * @param plaintext represents a string to be decrypted.
     * @return decrypted the decrypted string.
     */

    public String decrypt(String plaintext){
        char[] plainArray = plaintext.toCharArray();
        String decrypted = "";
        for(int i = 0; i < plaintext.length(); i++){
            decrypted = decrypted + decrypt(plainArray[i]);
        }
        return decrypted;
    }
}
