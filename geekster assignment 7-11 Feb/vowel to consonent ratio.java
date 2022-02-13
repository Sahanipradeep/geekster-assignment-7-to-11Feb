import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String str = sc.nextLine();
      int vowel = 0, consonant = 0;
      
      for(int i=0;i<str.length();i++){
        if(isVowel(str.charAt(i))){
          vowel++;
        }else{
          if(str.charAt(i) == ' '){
            continue;
          }
          consonant++;
        }
      }
      
      System.out.println(vowel + ":" + consonant);
    }
    
    
    public static boolean isVowel(char ch){
      
      if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        return true;
      }else{
        return false;
      }
    }
}