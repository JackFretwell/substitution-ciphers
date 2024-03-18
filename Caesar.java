import java.util.Hashtable;
public class Caesar extends MonoAlphaSubstitution{
    private static int shift;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    char[] mapArray = new char[100];

    public Caesar(){
        String subText = "";
        for(int i = 0; i <26; i++){
            subText = subText + alphabet[i];
        }
        for(int i = 0; i < 26; i++){
            subText = subText + upperCase[i];
        }


        mapArray = subText.toCharArray();
    }

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


    public String decrypt(String text){
        String map = new String(mapArray);
        MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
        String outc = m.encrypt(text);
        return outc;

    }

    public String encrypt(String text){
        String map = new String(mapArray);
        MonoAlphaSubstitution m = new MonoAlphaSubstitution(map);
        String outc = m.decrypt(text);
        return outc;

    }
    

    // STILL NEED TO IMPLEMENT PARAMETER ERROR MESSAGES.
    public static void main(String[] args){
        String type = args[0];
        int shift = (Integer.parseInt(args[1]));
        String text = args[2];


        if (type.equals("encrypt")){
                Caesar q = new Caesar(shift);
                System.out.println(q.encrypt(text));

        }
        else if (type.equals("decrypt")){
                Caesar q = new Caesar(shift);
                System.out.println(q.decrypt(text));
        }        
    }

}



