public class pracStr {
    public static void main(String[] args) {
        String s = new String("Java");
        System.out.println("문자열 : " + s);
        System.out.println(s.charAt(2));

        String v = new String("java");
        System.out.println(v.compareTo("1111"));
        System.out.println(v.compareTo("abcd"));
        System.out.println(v.compareTo("1234"));
        System.out.println(v.compareTo("5555"));
        System.out.println(v.compareToIgnoreCase("ABCD"));
        System.out.println(v.compareTo("ABCD"));
        System.out.println(v.concat(" 수업"));
        System.out.println("concat() 메서드 호출 후 문자열 : "+ v.concat(" 수업"));

        System.out.println(v.indexOf('j'));
        System.out.println(v.indexOf('a'));
        System.out.println(v.indexOf('v'));
        System.out.println(v.indexOf("java"));
        System.out.println(v.indexOf("Vwweow"));
        System.out.println(v.indexOf('p'));

        String vc = new String("   java           ");
        System.out.println(vc.trim());



    }
}
