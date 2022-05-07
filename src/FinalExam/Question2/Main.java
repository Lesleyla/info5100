package FinalExam.Question2;

public class Main {
    public static void main(String[] args) {
        String str = "aabcccccaaa";
        String show = getStringCompression(str);
        System.out.println("The String Compression is: ");
        if (show.length() < str.length()) {
            System.out.println(show);
        } else {
            System.out.println(str);
        }
    }
    private static String getStringCompression(String str){
        int n = str.length();
        String res = "";
        for(int i = 0; i < n;){
            int j = i;
            while(j < n && str.charAt(i) == str.charAt(j)) j++;
            res += str.charAt(i);
            if(j - i >= 1){  //count>1
                String tmp = Integer.toString(j - i);
                for(int k = 0; k < tmp.length(); k ++){
                    res += tmp.charAt(k);
                }
            }
            i = j;
        }
        return res;
    }
}
