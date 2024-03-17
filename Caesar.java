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
        for(int i = 1; i < 49; i +=2){
            for(int x = i-1; x <26; x++){
                mapArray[i] = alphabet[x];
                int shiftedIndex = (x + key) % 26;
                mapArray[i + 1] = alphabet[shiftedIndex];
                break;
            }
        }
    }









            
            
            
            
            

    


    public static void main(String[] args){

        Caesar test = new Caesar(3);
        for(int i = 0; i < mapArray.length; i++){
            System.out.print(mapArray[i]);
        }
    }








}
