public class pangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(CheckPangram(str.toLowerCase()));
    }
    public static Boolean CheckPangram(String str){
        if(str.length() < 26){
            return false;
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(str.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
