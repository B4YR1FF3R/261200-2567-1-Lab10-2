// หลังบ้าน[ข้อมูลบัตร]
public interface PayD {

    // เลขเครดิตการ์ด
    Long getCreditCardNo();
    void setCreditCardNo(Long creditCardNo);

    // ชื่อคนถือบัตร
    String getCustomerName();
    void setCustomerName(String customerName);

    // วันหมดอายุ
    String getCardExpDate();
    void setCardExpDate(String cardExpDate);

    // เลขCVV
    Short getCardCVVNo();
    void setCardCVVNo(Short cardCVVNo);

    // จำนวนเงินที่เหลือ
    Double getAmount();
    void setAmount(Double amount);
}
