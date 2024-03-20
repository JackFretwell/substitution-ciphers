/** 
 * 
 * @author Jack Fretwell
 * @version 1.0
 */
 
public class Vigenere extends Substitution {

    /**
     * Two strings and two ints are declared, allowing them to be used throughout the class.
     * 
     * An empty array shiftArray is declared, which is where future Caesar objects will be stored.
     */

    static String key = "";
    static String text = "";
    static Caesar[] shiftArray;
    static int count = 0;
    static int keyLength;

    /**
     * Vigenere's default constructor creates a Caesar object with a shift of -12224(to negate the manipulated shift in Caesar) which effectively creates a Caesar object with a shift of 0. This Caesar object is then stored into shiftArray.
     * 
     * Count is set to 0 to ensure that if multiple Vigenere objects are created, they won't inherit a manipulated number in count.
     */

    public Vigenere(){
        shiftArray = new Caesar[1];
        Caesar c = new Caesar(-12224);
        shiftArray[0] = c;
        count = 0;

     }

    /**
     * First takes a String and stores its length into keyLength.
     * 
     * It then creates an array called keyArray containing the input String.
     * 
     * shiftArray is intialised to be the length of the input string.
     * 
     * For each character in key, a matching Caesar object is created, using the difference between the character and 'A' as the shift value(-12224 to negate the manipulated shift in the Caesar class).
     * 
     * This Caesar object is stored in shiftArray, and count is set to 0 to ensure that if multiple Vigenere objects are created, they won't inherit a manipulated number in count.
     * 
     * @param key represents the key string inputted by the user which represents the shift pattern.
     */

    public Vigenere(String key){
        keyLength = key.length();
        char[] keyArray = key.toCharArray();
        shiftArray = new Caesar[keyLength];
        for(int i = 0; i < keyLength; i++){
            int shift = (keyArray[i] - 'A') - 12224;
            Caesar c = new Caesar(shift);
            shiftArray[i] = c;
            count = 0;

        }

    }

    /**
     * First checks whether count is longer than the length of the key, if it is, count will be set back to 0. This ensures that the shift pattern loops back around.
     * 
     * It then creates a new string from the array mapArray related to the Caesar object at the index matching the value of count(this string is the shifted alphabet).
     * 
     * A new MonoAlphaSubstitution object is created, using the string created above. 
     * 
     * MonoAlphaSubstituions encrypt method is called on the character, and count is iterated.
     * 
     * The encrypted character is returned.
     * 
     * @param c the character to be encrypted.
     * @return c the encrypted character.
     */

    public char encrypt(char c){
        char a = 'A';
            if (count >= keyLength){
                count = 0;
            }
            String map = new String(shiftArray[count].mapArray);
            MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
            a = m.encrypt(c);
            count++;
            return a;

        }

    /**
     * First checks whether count is longer than the length of the key, if it is, count will be set back to 0. This ensures that the shift pattern loops back around.
     * 
     * It then creates a new string from the array mapArray related to the Caesar object at the index matching the value of count(this string is the shifted alphabet).
     * 
     * A new MonoAlphaSubstitution object is created, using the string created above. 
     * 
     * MonoAlphaSubstituions decrypt method is called on the character, and count is iterated.
     * 
     * The decrypted character is returned.
     * 
     * @param c the character to be decrypted.
     * @return c the decrypted character.     
     */

    public char decrypt(char c){
        char a = 'A';
            if (count >= keyLength){
                count = 0;
            }
            String map = new String(shiftArray[count].mapArray);
            MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
            a = m.decrypt(c);
            count++;
            return a;

        }
    
    /**
     * main first checks the length of the arguments entered at the command line. If this is greater than 3 it will return an error message to the user, if it's less than 3 it will return an error message, if it's exactly 3 in length it will continue.
     * 
     * The three command line arguments are stored in to variables, and an if statement is used to check whether "encrypt" or "decrypt" was entered as the type. If neither is the case, an error will be returned.
     * 
     * For both encrypt and decrypt a new Vigenere object is created, using the key string as a parameter, which will create an array of Caesar objects as seen in the constructors.
     * 
     * Finally Substitutions's encrypt/decrypt method is called on the Vigenere object with the text to be deciphered/encrypted used as input.
     * 
     * @param args represents the three command line arguments, encrypt/decrypt, the key string, and the text to be manipulated.
     */

    public static void main(String[] args){

        int argsLength = args.length;

        if(argsLength > 3){
            System.out.println("Too many parameters!");
            System.out.println("Usage: java Vigenere encrypt key \"cipher text\"");

        }
        else if (argsLength < 3){
            System.out.println("Too few parameters!");
            System.out.println("Usage: java Vigenere encrypt key \"cipher text\"");
        }
        else{
            String type = args[0];
            key = args[1];
            text = args[2];
            
            if(type.equals("encrypt")){
                Vigenere v = new Vigenere(key);
                System.out.println(v.encrypt(text));

            }
            else if(type.equals("decrypt")){
                Vigenere v = new Vigenere(key);
                System.out.println(v.decrypt(text));
            }
            else{
                System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!");
                System.out.println("Usage: java Vigenere encrypt key \"cipher text\"");
            }

        }
    }
}
