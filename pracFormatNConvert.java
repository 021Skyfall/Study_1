public class pracFormatNConvert {

    public static int num() {
        int a = 10 - 20;
        return a;
    } // proto
    public  static String time() {
        String b = new String("11");
        return b;
    } // will convert String to int
    public  static int tem() {
        int x = -15;
        return  x;
    } // will convert int to double

    public static void main(String[] args) {
        int i = Math.abs(num());
        String c = String.valueOf(i);
        System.out.println(String.format("%s은 %s이다.",c,c));
        System.out.println();

        int v = Integer.parseInt(time()); // convert String to int
        double t = Math.abs(Double.valueOf(tem())); // convert int to double & delete -
//        System.out.println(t); 왜 아래에서 0이 저렇게 많이 나오냐 아 ㅋㅋ
        System.out.println(String.format("지금 시각은 오후 %d시 %d분이며, 현재 온도는 %f도 입니다.",v,v,t));
        // %s String / %f float / %d integer
    }

}

