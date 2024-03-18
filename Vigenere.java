public class Vigenere extends Substitution {
    static String key;
    static String text;
    static Caesar[] shiftArray;
    static int count = 0;


    public static void setText(String a){
        text = a;
    }

    public static void setKey(String b){
        key = b;
    }

    public static void setCount(int c){
        count = c;
    }

    //For Vigenere, I would recommend (but not require) that you use an attribute of type Caesar[] to keep around several Caesar objects.
    public Vigenere(){
        shiftArray = new Caesar[1];
        Caesar c = new Caesar(0);
        shiftArray[0] = c;
     }

    //For Vigenere, I would recommend (but not require) that you use an attribute of type Caesar[] to keep around several Caesar objects.
    public Vigenere(String key){
        char[] keyArray = key.toCharArray();
        shiftArray = new Caesar[key.length()];
        for(int i = 0; i < key.length(); i++){
            int shift = keyArray[i] - 'A';
            Caesar c = new Caesar(shift);
            shiftArray[i] = c;

        }

    }

    public char encrypt(char c){
        char a = 'A';
            if (count == key.length()){
                count = 0;
            }
            String map = new String(shiftArray[count].mapArray);
            MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
            a = m.decrypt(c);
            setCount((count + 1));
            return a;

        }

    
    

    public char decrypt(char c){
        char a = 'A';
            if (count == key.length()){
                count = 0;
            }
            String map = new String(shiftArray[count].mapArray);
            MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
            a = m.encrypt(c);
            setCount((count + 1));
            return a;

        }
    

    public static void main(String[] args){
        String type = args[0];
        String key = args[1];
        String text = args[2];
        setKey(key);
        setText(text);

        if(type.equals("encrypt")){
            Vigenere v = new Vigenere(key);
            System.out.println(v.encrypt(text));
        }
        if(type.equals("decrypt")){
            Vigenere v = new Vigenere(key);
            System.out.println(v.decrypt(text));
        }

        
    }
}
