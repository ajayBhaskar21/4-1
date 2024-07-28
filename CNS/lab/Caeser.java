import java.util.*;


class Caeser {

    static String performCaesarCipher(String msg) {
        return performCaesarCipher(msg, 3); // default shift is 3
    }

    static String performCaesarCipher(String msg, int shifts) {
        char[] chArr = msg.toCharArray();
        int n = msg.length();
        char[] lowers = new char[26];
        char[] caps = new char[26];

        for (int i = 97; i <= 122; i++)
            lowers[i - 97] = (char) i;
        for (int i = 65; i <= 90; i++)
            caps[i - 65] = (char) i;

        for (int i = 0; i < n; i++) {
            if (chArr[i] >= 97 && chArr[i] <= 122) {
                // if lower case
                chArr[i] = lowers[(chArr[i] - 97 + shifts) % 26];
            } else if (chArr[i] >= 65 && chArr[i] <= 90) {
                // if upper case
                chArr[i] = caps[(chArr[i] - 65 + shifts) % 26];
            }
        }

        return String.valueOf(chArr);
    }

    public static void main(String[] args) {
        System.out.println("Enter the input : ");
        String s = Input.takeString(); // in.next();
        System.out.println(performCaesarCipher(s));
    }
}

