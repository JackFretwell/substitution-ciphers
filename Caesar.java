import java.util.Hashtable;
public class Caesar extends MonoAlphaSubstitution{
    private int shift;
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] mapArray = new char[50];

    public Caesar(){
        for(int i = 0; i < 26; i++){
            mapArray[i] = alphabet[i];
        }
    }

    public Caesar(int key){
        String subText = "";

        Hashtable<Character, Character> mapped = new Hashtable<>();

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
            mapArray = subText.toCharArray();
        }
    }









            
            
            
            
            

    


    public static void main(String[] args){

        //Caesar test = new Caesar(3);
        //for(int i = 0; i < mapArray.length; i++){
        //    System.out.print(mapArray[i]);
        //}
    }








}
