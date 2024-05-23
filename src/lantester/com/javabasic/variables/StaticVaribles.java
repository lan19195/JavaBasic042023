package lantester.com.javabasic.variables;

public class StaticVaribles {
    int tuoi = 20;
    static String name ="Lan";

    public static void main(String[] args) {
        StaticVaribles age = new StaticVaribles();
        System.out.println("Tuoi:" + age.tuoi); // vì biến tuoi không phải static, muốn gọi phải thông qua đối tượng class trung gian (khởi tạo)
        System.out.println("Ten:" + name); // vì là static nên gọi trực tiếp ở hàm main
    }

}
