/** 
 * 
 * @author Jack Fretwell
 * @version 1.0
 */
 
public class MonoAlphaSubstitution extends Substitution{

    /** 
     * Defines an empty array of size 128, where eventually the converted characters between ASCII values 0 and 127 will be stored.
     */

    int[] mapArray = new int[128];

    /**
     * The MonoAlphaSubstitution default constructor creates an array of ASCII values. As no key was entered at the command line, this array represents an identity function and returns to the user their String, unaltered.
     */
  
    public MonoAlphaSubstitution(){
        for(int i = 0; i < 128; i++){
            mapArray[i] = i;
        }
    }

    /**
     * This MonoAlphaSubstitution constructor takes in the key that the user inputted at the command line. It then traverses through the key, and the empty mapArray declared above. When the index i of mapArray matches the ASCII value of one of the characters in the key,
     * it will check whether the character is located at an even index. If it is, then the value after the index is stored in to mapArray, under the ASCII value of the key index. This effectively creates an array of substituted characters, and will be later used to translate
     * the users input text. 
     * 
     * If the character in the key string isn't at an even index, or doesn't match i, it will just store the value of i at the index i in mapArray. This represents the character remaining the same, as no translation was provided for it within the key string.
     * 
     * @param s represents the key string.
     */

    public MonoAlphaSubstitution(String s){
        char[] sArray = s.toCharArray();
        for(int i = 0; i < 128; i ++){
            boolean found = false;

            for(int j = 0; j < sArray.length; j++){
                if((char)i == sArray[j] && j%2 == 0){
                    mapArray[i] = sArray[j+1];
                    found = true;
                }
            }
                if(found == false){
                    mapArray[i] = i;
                }
                
        }
    }

    /**
     * Takes a character, then looks in mapArray at the character's ASCII index,replacing the character with the character stored at that index.
     * 
     * @param c the character to be translated.
     * @return c the translated character.
     */

    public char encrypt(char c){
        c = (char) mapArray[c];
        return c;
        }
    
    /**
     * First an array containing all ASCII characters between 0 and 127 is created.
     * 
     * mapArray is searched to see if the character c is contained within it. If it is, then the variable position stores the ASCII value of c.
     * 
     * The variable 'position' is then used to find the index relating to c's ASCII value within the standard alphanumeric alphabet. The character stored at this index will be the original value of c, before it was encrypted.
     * 
     * c is then returned.
     * 
     * @param c the character to be decrypted.
     * @return c the decrypted character.
     */

    public char decrypt(char c){
        int[] standardAlph = new int[128];
        int position = 0;
        for(int i = 0; i < 128; i++){
            standardAlph[i] = i;
        }

        for(int i = 0; i < 128; i++){
            if (c == mapArray[i]){
                position = i;
            }

        }
        c = (char) standardAlph[position];

        return c;
        }    

    /**
     * main first checks the length of the arguments entered at the command line. If this is greater than 3 it will return an error message to the user, if it's less than 3 it will return an error message, if it's exactly 3 in length it will continue.
     * 
     * The three command line arguments are stored in to variables, and an if statement is used to check whether "encrypt" or "decrypt" was entered as the type. If neither is the case, an error will be returned.
     * 
     * For both encrypt and decrypt a new MonoAlphaSubstitution object is created, using the key string as a parameter, which will create an array of translated characters.
     * 
     * Finally Substitution's encrypt/decrypt method is called on the MonoAlphaSubstitutions object with the text to be deciphered/encrypted used as input.
     * 
     * @param args represents the three command line arguments, encrypt/decrypt, the key string, and the text to be translated.
     */


    public static void main(String[] args){
        
        int argsLength = args.length;

        if(argsLength > 3){
            System.out.println("Too many parameters!");
            System.out.println("Usage: java MonoAlphaSubstitution encrypt key \"cipher text\"");

        }
        else if (argsLength < 3){
            System.out.println("Too few parameters!");
            System.out.println("Usage: java MonoAlphaSubstitution encrypt key \"cipher text\"");
        }
        else{
            String type = args[0];
            String key = args[1];
            String text = args[2];
            MonoAlphaSubstitution m = new MonoAlphaSubstitution(key);
        
            if (type.equals("encrypt")){
                String outc = m.encrypt(text);
                System.out.println(outc);

            }
            else if (type.equals("decrypt")){
                String outc = m.decrypt(text);
                System.out.println(outc);
            }
            else{
                System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!");
                System.out.println("Usage: java MonoAlphaSubstitution encrypt key \"cipher text\"");
            }        
        }
    
    }
}


    

