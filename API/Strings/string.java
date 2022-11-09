package API.Strings;

public class string {
    public static void main(String[] args) {
        String str1 = "fuck";
        String str2 = "you";
        System.out.println(str1.concat(str2));    // concat

        System.out.println(String.join(" ! ",str1,str2));    //join

        System.out.println(str2.charAt(1));  // charAt

        System.out.println(str1.indexOf("ck")); // indexOf, lastindexOf

        System.out.println(str1.replace("u", "a")); //replace
    }
}
