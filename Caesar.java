import java.util.Hashtable;
public class Caesar extends MonoAlphaSubstitution{
    private int shift;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static char[] mapArray = new char[100];

    public Caesar(){
        for(int i = 0; i < 52; i++){
            mapArray[i] = alphabet[i];
        }
    }

    public Caesar(int key){
        String subText = "";

        Hashtable<Character, Character> mapped = new Hashtable<>();
            mapped.put('A',Character.toUpperCase(upperCase[(0 + key) %26]));
            mapped.put('B',Character.toUpperCase(upperCase[(1 + key) %26]));
            mapped.put('C',Character.toUpperCase(upperCase[(2 + key) %26]));
            mapped.put('D',Character.toUpperCase(upperCase[(3 + key) %26]));
            mapped.put('E',Character.toUpperCase(upperCase[(4 + key) %26]));
            mapped.put('F',Character.toUpperCase(upperCase[(5 + key) %26]));
            mapped.put('G',Character.toUpperCase(upperCase[(6 + key) %26]));
            mapped.put('H',Character.toUpperCase(upperCase[(7 + key) %26]));
            mapped.put('I',Character.toUpperCase(upperCase[(8 + key) %26]));
            mapped.put('J',Character.toUpperCase(upperCase[(9 + key) %26]));
            mapped.put('K',Character.toUpperCase(upperCase[(10 + key) %26]));
            mapped.put('L',Character.toUpperCase(upperCase[(11 + key) %26]));
            mapped.put('M',Character.toUpperCase(upperCase[(12 + key) %26]));
            mapped.put('N',Character.toUpperCase(upperCase[(13 + key) %26]));
            mapped.put('O',Character.toUpperCase(upperCase[(14 + key) %26]));
            mapped.put('P',Character.toUpperCase(upperCase[(15 + key) %26]));
            mapped.put('Q',Character.toUpperCase(upperCase[(16 + key) %26]));
            mapped.put('R',Character.toUpperCase(upperCase[(17 + key) %26]));
            mapped.put('S',Character.toUpperCase(upperCase[(18 + key) %26]));
            mapped.put('T',Character.toUpperCase(upperCase[(19 + key) %26]));
            mapped.put('U',Character.toUpperCase(upperCase[(20 + key) %26]));
            mapped.put('V',Character.toUpperCase(upperCase[(21 + key) %26]));
            mapped.put('W',Character.toUpperCase(upperCase[(22 + key) %26]));
            mapped.put('X',Character.toUpperCase(upperCase[(23 + key) %26]));
            mapped.put('Y',Character.toUpperCase(upperCase[(24 + key) %26]));
            mapped.put('Z',Character.toUpperCase(upperCase[(25 + key) %26]));





            mapped.put('a',alphabet[(0 + key) %26]);
            mapped.put('b',alphabet[(1 + key) %26]);
            mapped.put('c',alphabet[(2 + key) %26]);
            mapped.put('d',alphabet[(3 + key) %26]);
            mapped.put('e',alphabet[(4 + key) %26]);
            mapped.put('f',alphabet[(5 + key) %26]);
            mapped.put('g',alphabet[(6 + key) %26]);
            mapped.put('h',alphabet[(7 + key) %26]);
            mapped.put('i',alphabet[(8 + key) %26]);
            mapped.put('j',alphabet[(9 + key) %26]);
            mapped.put('k',alphabet[(10 + key) %26]);
            mapped.put('l',alphabet[(11 + key) %26]);
            mapped.put('m',alphabet[(12 + key) %26]);
            mapped.put('n',alphabet[(13 + key) %26]);
            mapped.put('o',alphabet[(14 + key) %26]);
            mapped.put('p',alphabet[(15 + key) %26]);
            mapped.put('q',alphabet[(16 + key) %26]);
            mapped.put('r',alphabet[(17 + key) %26]);
            mapped.put('s',alphabet[(18 + key) %26]);
            mapped.put('t',alphabet[(19 + key) %26]);
            mapped.put('u',alphabet[(20 + key) %26]);
            mapped.put('v',alphabet[(21 + key) %26]);
            mapped.put('w',alphabet[(22 + key) %26]);
            mapped.put('x',alphabet[(23 + key) %26]);
            mapped.put('y',alphabet[(24 + key) %26]);
            mapped.put('z',alphabet[(25 + key) %26]);

        for(int i = 0; i <26; i++){
            subText = subText + alphabet[i] + mapped.get(alphabet[i]);
        }
        for(int i = 0; i < 26; i++){
            subText = subText + upperCase[i] + mapped.get(upperCase[i]);
        }


        mapArray = subText.toCharArray();

    }


    public static void main(String[] args){
        String type = args[0];
        int key = Integer.parseInt(args[1]);
        String text = args[2];

        //Caesar test = new Caesar(3);
        //for(int i = 0; i < mapArray.length; i++){
        //    System.out.print(mapArray[i]);
        //}
        Caesar q = new Caesar(3);
        String testMap = new String(q.mapArray);
        //System.out.println(testMap);
        

        MonoAlphaSubstitution c = new MonoAlphaSubstitution(testMap);
        for(int i = 0; i<c.mapArray.length;i++){
            System.out.print((char)c.mapArray[i]);
        }
        //MonoAlphaSubstitution c = new Caesar(10);
        //String test = c.encrypt(text);
        //System.out.println(test);

    
    }





}



