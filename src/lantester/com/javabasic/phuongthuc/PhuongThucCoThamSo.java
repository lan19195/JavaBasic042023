package lantester.com.javabasic.phuongthuc;

public class PhuongThucCoThamSo {
    static float INTEREST_RATE = 5.6F;

    public static double tinhLai(long soTienGui) {
        return ((soTienGui * INTEREST_RATE) / 100);
    }

    public static void main(String[] args) {
        System.out.println(tinhLai(50000000));
    }
}
