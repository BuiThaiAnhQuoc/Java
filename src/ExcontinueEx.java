import java.util.Scanner;

public class ExcontinueEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 5개 입력하세요");
        int sum=0;

        for(int i = 0;i < 5;i++){
            int n = scanner.nextInt();
            
            if (n < 0) { // 음수이면 건너뛴다
                continue;
            }

            sum += n; // 양수일 때만 합산
        }

        System.out.println("양수 합계: " + sum);
    }
}
    

