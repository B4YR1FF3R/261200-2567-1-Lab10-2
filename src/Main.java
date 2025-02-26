public class Main {
    public static void main(String[] args) {
        // สร้างบัตร Xpay และใส่ข้อมูล
        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);

        // ใช้ Adapter แปลงเป็น PayD
        PayD payD = new XpayToPayDAdapter(xpay);

        /*
        // ดูข้อมูลหลังจากแปลงเป็น PayD
        System.out.println("Customer Name: " + payD.getCustomerName());
        System.out.println("Credit Card No: " + payD.getCreditCardNo());
        System.out.println("Card Expiry Date: " + payD.getCardExpDate());
        System.out.println("CVV: " + payD.getCardCVVNo());
        System.out.println("Amount: " + payD.getAmount());

         */
    }
}
