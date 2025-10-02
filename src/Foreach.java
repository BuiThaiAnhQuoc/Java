
public class Foreach {
    public static void main(String[] args) {
         int[] n = {1, 2, 3, 4, 5};
        int sum = 0;

        // for-each 문으로 배열 순회
        for(int k : n){
            System.out.print(k + " "); // 줄 바꿈 없이 출력
            sum += k;
        }

        System.out.println(); // 줄 바꿈
        System.out.println("합계: " + sum);
    }
}



