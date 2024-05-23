package lantester.com.javabasic.phuongthuc;

import lantester.com.javabasic.kieudulieu.Bank;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        Bank.getInterestRate(); // hàm return này mình chưa tính toán nên ko trả về gì
        double tongTien = (Bank.getInterestRate()* 1000000)/ 100;
        System.out.println(tongTien);
    }
}
