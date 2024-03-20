/** 
 * 
 * @author Jack Fretwell
 * @version 1.0
 */
 
import java.util.Hashtable;

public class Caesar extends MonoAlphaSubstitution{

    /**
     * Defines a variable named shift which stores the input shift value, and three char arrays, two that represent the lower and uppercase alphabet, and an empty array that will store shifted alphabet in a format useable by the MonoAlphaSubstitution class.
     */

    private static int shift;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] mapArray = new char[100];

    /**
     * The default Caesar constructor maps each character to itself by using a hashtable. It will then create an array that can be interpreted by the MonoAlphaSubstitution class, effectively storing double of each character. This leads to characters being returned
     * as they were inputted, as no shift was entered by the user.
     */

    public Caesar(){
        Hashtable<Character, Character> mapped = new Hashtable<>();
        String subText = "";

            mapped.put('A','A');
            mapped.put('B','B');
            mapped.put('C','C');
            mapped.put('D','D');
            mapped.put('E','E');
            mapped.put('F','F');
            mapped.put('G','G');
            mapped.put('H','H');
            mapped.put('I','I');
            mapped.put('J','J');
            mapped.put('K','K');
            mapped.put('L','L');
            mapped.put('M','M');
            mapped.put('N','N');
            mapped.put('O','O');
            mapped.put('P','P');
            mapped.put('Q','Q');
            mapped.put('R','R');
            mapped.put('S','S');
            mapped.put('T','T');
            mapped.put('U','U');
            mapped.put('V','V');
            mapped.put('W','W');
            mapped.put('X','X');
            mapped.put('Y','Y');
            mapped.put('Z','Z');

            mapped.put('a','a');
            mapped.put('b','b');
            mapped.put('c','c');
            mapped.put('d','d');
            mapped.put('e','e');
            mapped.put('f','f');
            mapped.put('g','g');
            mapped.put('h','h');
            mapped.put('i','i');
            mapped.put('j','j');
            mapped.put('k','k');
            mapped.put('l','l');
            mapped.put('m','m');
            mapped.put('n','n');
            mapped.put('o','o');
            mapped.put('p','p');
            mapped.put('q','q');
            mapped.put('r','r');
            mapped.put('s','s');
            mapped.put('t','t');
            mapped.put('u','u');
            mapped.put('v','v');
            mapped.put('w','w');
            mapped.put('x','x');
            mapped.put('y','y');
            mapped.put('z','z');

        for(int i = 0; i <26; i++){
            subText = subText + alphabet[i] + mapped.get(alphabet[i]);
        }
        for(int i = 0; i < 26; i++){
            subText = subText + upperCase[i] + mapped.get(upperCase[i]);
        }


        mapArray = subText.toCharArray();
    }

    /**
     * Takes an input shift, which will represent the integer that the characters are to be shifted by. It then uses a hashtable to map each character to it's character plus the shift. Mod 26 is used to ensure the shift wraps back around if the new character value
     * is greater than 26. 
     * 
     * It stores these mappings into an array where each letter of the alphabet is followed by it's newly mapped character. 
     * 
     * @param shift the int that the characters are to be shifted by.
     * 
     */

    public Caesar(int shift){
        String subText = "";
        shift = shift + 12224;

        Hashtable<Character, Character> mapped = new Hashtable<>();
            mapped.put('A',Character.toUpperCase(upperCase[(0 + shift) %26]));
            mapped.put('B',Character.toUpperCase(upperCase[(1 + shift) %26]));
            mapped.put('C',Character.toUpperCase(upperCase[(2 + shift) %26]));
            mapped.put('D',Character.toUpperCase(upperCase[(3 + shift) %26]));
            mapped.put('E',Character.toUpperCase(upperCase[(4 + shift) %26]));
            mapped.put('F',Character.toUpperCase(upperCase[(5 + shift) %26]));
            mapped.put('G',Character.toUpperCase(upperCase[(6 + shift) %26]));
            mapped.put('H',Character.toUpperCase(upperCase[(7 + shift) %26]));
            mapped.put('I',Character.toUpperCase(upperCase[(8 + shift) %26]));
            mapped.put('J',Character.toUpperCase(upperCase[(9 + shift) %26]));
            mapped.put('K',Character.toUpperCase(upperCase[(10 + shift) %26]));
            mapped.put('L',Character.toUpperCase(upperCase[(11 + shift) %26]));
            mapped.put('M',Character.toUpperCase(upperCase[(12 + shift) %26]));
            mapped.put('N',Character.toUpperCase(upperCase[(13 + shift) %26]));
            mapped.put('O',Character.toUpperCase(upperCase[(14 + shift) %26]));
            mapped.put('P',Character.toUpperCase(upperCase[(15 + shift) %26]));
            mapped.put('Q',Character.toUpperCase(upperCase[(16 + shift) %26]));
            mapped.put('R',Character.toUpperCase(upperCase[(17 + shift) %26]));
            mapped.put('S',Character.toUpperCase(upperCase[(18 + shift) %26]));
            mapped.put('T',Character.toUpperCase(upperCase[(19 + shift) %26]));
            mapped.put('U',Character.toUpperCase(upperCase[(20 + shift) %26]));
            mapped.put('V',Character.toUpperCase(upperCase[(21 + shift) %26]));
            mapped.put('W',Character.toUpperCase(upperCase[(22 + shift) %26]));
            mapped.put('X',Character.toUpperCase(upperCase[(23 + shift) %26]));
            mapped.put('Y',Character.toUpperCase(upperCase[(24 + shift) %26]));
            mapped.put('Z',Character.toUpperCase(upperCase[(25 + shift) %26]));

            mapped.put('a',alphabet[(0 + shift) %26]);
            mapped.put('b',alphabet[(1 + shift) %26]);
            mapped.put('c',alphabet[(2 + shift) %26]);
            mapped.put('d',alphabet[(3 + shift) %26]);
            mapped.put('e',alphabet[(4 + shift) %26]);
            mapped.put('f',alphabet[(5 + shift) %26]);
            mapped.put('g',alphabet[(6 + shift) %26]);
            mapped.put('h',alphabet[(7 + shift) %26]);
            mapped.put('i',alphabet[(8 + shift) %26]);
            mapped.put('j',alphabet[(9 + shift) %26]);
            mapped.put('k',alphabet[(10 + shift) %26]);
            mapped.put('l',alphabet[(11 + shift) %26]);
            mapped.put('m',alphabet[(12 + shift) %26]);
            mapped.put('n',alphabet[(13 + shift) %26]);
            mapped.put('o',alphabet[(14 + shift) %26]);
            mapped.put('p',alphabet[(15 + shift) %26]);
            mapped.put('q',alphabet[(16 + shift) %26]);
            mapped.put('r',alphabet[(17 + shift) %26]);
            mapped.put('s',alphabet[(18 + shift) %26]);
            mapped.put('t',alphabet[(19 + shift) %26]);
            mapped.put('u',alphabet[(20 + shift) %26]);
            mapped.put('v',alphabet[(21 + shift) %26]);
            mapped.put('w',alphabet[(22 + shift) %26]);
            mapped.put('x',alphabet[(23 + shift) %26]);
            mapped.put('y',alphabet[(24 + shift) %26]);
            mapped.put('z',alphabet[(25 + shift) %26]);

        for(int i = 0; i <26; i++){
            subText = subText + alphabet[i] + mapped.get(alphabet[i]);
        }
        for(int i = 0; i < 26; i++){
            subText = subText + upperCase[i] + mapped.get(upperCase[i]);
        }


        mapArray = subText.toCharArray();

    }

    /**
     * Decrypt first creates a new string by casting mapArray to a string, as a reminder mapArray contains the shifted alphabet. Using this string it creates a new MonoAlphaSubstitution object, and then calls Substitutions decrypt method on to that object. The text that needs
     * decrypting is used as the input. Once the text has been decrypted it is returned from the method.
     * 
     * @param text the String that is to be decrypted.
     * @return outc the decrypted String.
     */

    public String decrypt(String text){
        String map = new String(mapArray);
        MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
        String outc = m.decrypt(text);
        return outc;

    }

    /**
     * Encrypt first creates a new string by casting mapArray to a string, as a reminder mapArray contains the shifted alphabet. Using this string it creates a new MonoAlphaSubstitution object, and then calls Substitutions encrypt method on to that object. The text that needs
     * encrypting is used as the input. Once the text has been encrypted it is returned from the method.
     * 
     * @param text the String that is to be encrypted.
     * @return outc the encrypted String.
     */

    public String encrypt(String text){
        String map = new String(mapArray);
        MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
        String outc = m.encrypt(text);
        return outc;

    }
    
    /**
     * main first checks the length of the arguments entered at the command line. If this is greater than 3 it will return an error message to the user, if it's less than 3 it will return an error message, if it's exactly 3 in length it will continue.
     * 
     * The three command line arguments are stored in to variables, and an if statement is used to check whether "encrypt" or "decrypt" was entered as the type. If neither is the case, an error will be returned.
     * 
     * For both encrypt and decrypt a new Caesar object is created, using the integer shift as a parameter, which will create a character mapping seen in the constructors above.
     * 
     * Finally Caesar's encrypt/decrypt method is called on the Caesar object with the text to be deciphered/encrypted used as input.
     * 
     * @param args represents the three command line arguments, encrypt/decrypt, the number for the characters to be shifted by, and the text to be manipulated.
     */

    public static void main(String[] args){
        
        int argsLength = args.length;

        if(argsLength > 3){
            System.out.println("Too many parameters!");
            System.out.println("Usage: java Caesar encrypt key \"cipher text\"");

        }
        else if (argsLength < 3){
            System.out.println("Too few parameters!");
            System.out.println("Usage: java Caesar encrypt key \"cipher text\"");
        }
        else{
            String type = args[0];
            shift = (Integer.parseInt(args[1]));
            String text = args[2];

            if (type.equals("encrypt")){
                    Caesar q = new Caesar(shift);
                    System.out.println(q.encrypt(text));

            }
            else if (type.equals("decrypt")){
                    Caesar q = new Caesar(shift);
                    System.out.println(q.decrypt(text));
            }
            else{
                System.out.println("The first parameter must be \"encrypt\" or \"decrypt\"!");
                System.out.println("Usage: java Caesar encrypt key \"cipher text\"");
            }        
    }

}
}



