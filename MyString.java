public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        if (str == null) {
            return ""; 
        }    
        
        StringBuilder LCstr = new StringBuilder();
        
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isUpperCase(c)) {
                    LCstr.append(Character.toLowerCase(c));
                } else {
                    LCstr.append(c);
                }
            }
        
            return LCstr.toString();
        
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.isEmpty()) {
            return true;
        }
        
        if (str2.length() > str1.length()) {
            return false;
        }
        
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean sub = true;
    
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    sub = false;
                    break; 
                }
            }
    
            if (sub) {
                return true; 
            }
        }
    

        return false;
    }
}
