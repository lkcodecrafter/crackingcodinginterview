public class IsUniqueBitManipulation {

    public boolean isUniqueBit(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';

            if (val < 0 || val > 25) {
                System.out.println("Only lowercase a–z allowed.");
                return false;
            }

            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }
        return true;
    }

    public static void main(String[] args) {
        IsUniqueBitManipulation obj = new IsUniqueBitManipulation();
        System.out.println(obj.isUniqueBit("abcd")); // true
        System.out.println(obj.isUniqueBit("abcda")); // false
        System.out.println(obj.isUniqueBit("abcD")); // false (capital D not allowed)
    }
}
