package telkomuniversity.ac.id.adieb;

public class Main {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c + " -> ");
            if (c >= 'a' && c <= 'm' || c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z' || c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            System.out.println(c);
        }
    }
}
