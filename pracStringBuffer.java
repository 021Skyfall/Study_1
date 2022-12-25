public class pracStringBuffer {
    public static void main(String[] args) {
        // append() method
    StringBuffer s = new StringBuffer("Java");
        System.out.println(s.append(" is amazing"));
        // builder 랑 비슷한데 한 줄로 처리되네 / 최적화 느낌인가?

        System.out.println();

        // capacity() method
        StringBuffer s01 = new StringBuffer();
        StringBuffer s02 = new StringBuffer("Java");
        System.out.println(s01.capacity());
        System.out.println(s02.capacity());
        // 버퍼의 현재 크기 ~> 기본 16 + 문자 넣은 만큼 / 총 몇 자인지 확인하기 편할듯
        System.out.println(s02.capacity()-16); // 이런식으로

        //delete() method
        StringBuffer s1 = new StringBuffer("Java Oracle");
        System.out.println(s1.delete(4,5)); // 스페이스만 사라짐, 뒷 인덱스 바로 앞까지
        System.out.println(s1.delete(0,5)); // 근데 얘는 왜 뒷 인덱스까지 없어지지 ~> 아 위에서 변경된게 저장됐나보네 ㅋㅋ
        // #인덱스 부터, #인덱스 바로 앞 까지 문자열 삭제

        // insert() method
        StringBuffer i1 = new StringBuffer("Java is perfect language!");
        System.out.println(i1.insert(4, " that i love"));
        // offset 위치 지정해서 문자열 삽입 append()는 뒤로 쭊쭊 이어 붙이는 거라면
        // 얘는 말 그대로 삽입
        
    }
}
