import java.util.StringTokenizer;

public class pracStringToken {
    public static void main(String[] args) {

        String a = "Hello, World! i'm practicing String Token now!";
        StringTokenizer tok = new StringTokenizer(a);
        System.out.println(a);
        System.out.println();
        System.out.println("Total Tokens : " + tok.countTokens());
        System.out.println();

        while (tok.hasMoreTokens()) {
            System.out.println(tok.nextToken());
            System.out.println("total tokens:"+tok.countTokens());
        }

    }
}
