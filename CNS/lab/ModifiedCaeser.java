import java.util.*;

class ModifiedCaeser {
    public static void main(String[] args) {
        System.out.println("Enter a msg and k : ");
        String msg = Input.takeString();
        int k = Input.takeInt();
        System.out.println(Caeser.performCaesarCipher(msg, k));
    }
}
