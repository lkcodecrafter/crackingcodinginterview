public class IsUniqueWithDS {

    public boolean isUniqueWithDS(String str) {
        if (str.length() > 128)
            return false;

        boolean[] seen = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (seen[val]) {
                return false;
            }
            seen[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        IsUniqueWithDS obj = new IsUniqueWithDS();
        System.out.println(obj.isUniqueWithDS("abcd")); // true
        System.out.println(obj.isUniqueWithDS("abcda")); // false
    }
}
