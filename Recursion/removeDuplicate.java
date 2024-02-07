package Recursion;

public class removeDuplicate {
    static void removeDuplicate(String str,int idx, StringBuilder sb,boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            //duplicate
            removeDuplicate(str, idx+1, sb, map);
        }
        else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, sb.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        removeDuplicate("prajwal", 0,new StringBuilder(""), new boolean[26]);
    }
}
