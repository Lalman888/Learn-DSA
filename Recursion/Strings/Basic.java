package Recursion.Strings;

public class Basic {
    public static void main(String[] args) {
     String str = "baccad";
//     System.out.println(removeA(str));
//        System.out.println(removeE(str,"",0));
        System.out.println(removeString("a for an apple b for boy"));

    }

    public static String removeE(String str, String ans,int i ) {
        if(str.length()-1<i ){
            return ans;
        }
        if(str.charAt(i) != 'a'){
            ans = ans+ str.charAt(i);
        }

        return removeE(str,ans,i+1);
    }

    private static String removeA(String s) {
        if(s.isEmpty()){
            return s;
        }

        char ch = s.charAt(0);

        if(ch == 'a'){
            return removeA(s.substring(1));
        } else{
            return ch+ removeA(s.substring(1));
        }
    }

    private static String removeString(String s) {
        if(s.isEmpty()){
            return s;
        }


        if(s.startsWith("apple")){
            return removeString(s.substring(5));
        } else{
            return s.charAt(0) + removeString(s.substring(1));
        }
    }


}
