public class Vigenere extends Substitution {
    static String key = "";
    static String text = "";
    static Caesar[] shiftArray;
    static int count = 0;
    static int keyLength;

    
    public Vigenere(){
        shiftArray = new Caesar[1];
        Caesar c = new Caesar(-12224);
        shiftArray[0] = c;
        count = 0;

     }

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
