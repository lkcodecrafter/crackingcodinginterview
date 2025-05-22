public class IsUniqueNoDS {

    public boolean isUniqueNoDS(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsUniqueNoDS obj = new IsUniqueNoDS();
        System.out.println(obj.isUniqueNoDS("abcd")); // true
        System.out.println(obj.isUniqueNoDS("abcda")); // false
    }
}
