package SmartProgrammingJavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class $25UniqueStringFind {
    public static void main(String[] args) {
        String str = "Swiss";
//        HashSet<Character> uniqueElement = new HashSet<>();
//        StringBuilder uniquesbl = new StringBuilder();
//        for(char ch:str.toCharArray()){
//            if(uniqueElement.add(ch)){
//                uniquesbl.append(ch);
//            }
//        }
//        System.out.println(uniquesbl);
//        String newStr = str.toLowerCase();
//        for (int i=0;i<newStr.length();i++){
//            int flag=0;
//            for (int j=0;j<newStr.length();j++){
//                if(newStr.charAt(i)==newStr.charAt(j)&&i!=j){
//                   flag =1;
//                   break;
//                }
//            }
//            if (flag==0){
//                System.out.println(newStr.charAt(i));
//            }
//        }

       str = str.toLowerCase();
        Map<Character,Integer> charCount = new HashMap<>();
        for (char ch:str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> entry:charCount.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }

    }
}
