package others.FinalList.StringCompression;
//leetcode 443

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int show = getStringCompression(chars);
        printShowed(chars, show);
    }

    private static int getStringCompression(char[] chars){
        int n = chars.length;
        int res = 0;
        for(int i=0;i<n;){
            int j = i;
            while(j < n && chars[i] == chars[j]) j++;
            chars[res++] = chars[i];
            if(j - i > 1){ //count>1
                String tmp = Integer.toString(j - i);
                for(int k = 0; k < tmp.length(); k ++){
                    chars[res++] = tmp.charAt(k);
                }
                //对temp/即count逐位输出
            }
            i = j;
        }
        return res;

    }

    private static void printShowed(char[] chars, int show) {
        System.out.print('[');
        for (int i = 0; i < show - 1; i++){
            System.out.print(Character.toString(chars[i]) + ',');
        }
        System.out.print(Character.toString(chars[show-1]));
        System.out.println(']');
    }
}
