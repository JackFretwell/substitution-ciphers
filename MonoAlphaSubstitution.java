
public class MonoAlphaSubstitution extends Substitution{
    int[] mapArray = new int[128];
  
    public MonoAlphaSubstitution(){
        for(int i = 0; i < 128; i++){
            mapArray[i] = i;
        }
    }

    public MonoAlphaSubstitution(String s){
        char[] sArray = s.toCharArray();
        for(int i = 0; i < 128; i ++){
            boolean found = false;

            for(int j = 0; j < sArray.length; j++){
                if((char)i == sArray[j] && j%2 == 1){
                    mapArray[i] = sArray[j-1];
                    found = true;
                }
            }
                if(found == false){
                    mapArray[i] = i;
                }
                
        }
    }

    public char encrypt(char c){
        c = (char) mapArray[c];
        return c;
        }
    

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


    // STILL NEED TO IMPLEMENT PARAMETER ERROR MESSAGES.
    public static void main(String[] args){
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
    }
    
    }


    

