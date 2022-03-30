package practice_example;

public class Practice1 {
    public static void main(String[] args) {
        String s= "aabbcdeeffg";
        String nS;
        String nSU="";
        for (int i = 0; i < s.length() ; i++) {
            nS=s.replace((""+s.charAt(i)),"");
            if(nS.length()==s.length()-1){
                nSU+=s.charAt(i);
            }
        }
        System.out.println(nSU);
    }
}

