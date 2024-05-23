package lantester.com.javabasic.phuongthuc;

public class LearnMethod {
    // Hàm không trả về giá trị
    public void thongTinNhanVien(){
        System.out.println("Lan");
    }

    //Hàm trả về giá trị
    public static int sum(int a, int b) {
        // phương thức kết thúc khi gặp return
        return a + b;
    }

    public static void main(String[] args) {
        LearnMethod nhanvien = new LearnMethod();
        nhanvien.thongTinNhanVien();
        System.out.println(sum(1,2));
    }
}
