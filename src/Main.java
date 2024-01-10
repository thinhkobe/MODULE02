
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.w3c.dom.css.CSSUnknownRule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // biến lấy giá trị từ người dùng
        Scanner scanner = new Scanner(System.in);
        //lấy dữ liệu từ người dùng
        System.out.println("nhập điểm toán");
        float math = scanner.nextInt();
        System.out.println("nhập điểm lý");
        float pysycal = scanner.nextInt();
        System.out.println("nhập điểm hóa");
        float chemittry = scanner.nextInt();
        System.out.println("nhập điểm văn");
        float literature = scanner.nextInt();
        System.out.println("nhập điểm tiếng anh");
        float english = scanner.nextInt();

        float average = (math + pysycal + chemittry + literature + english) / 5;
        System.out.println("điểm trung bình của bạn là" + average);
        if (average < 5) {
            System.out.println("xếp loại học lực yếu");
        } else if (average > 5 && average < 6.5) {
            System.out.println("xếp loại học lực trung bình");

        } else if (average > 6.5 && average < 8) {
            System.out.println("xếp loại học lực khá");


        } else if (average > 8 && average < 9) {
            System.out.println("xếp loại học lực giỏi");
        }
    }
}
