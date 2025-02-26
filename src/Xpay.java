// หลังบ้าน[ข้อมูลบัตร]
public interface Xpay {

    // เลขเครดิตการ์ด
    String getCreditCardNo();
    void setCreditCardNo(String creditCardNo);

    // ชื่อคนถือบัตร
    String getCustomerName();
    void setCustomerName(String customerName);

    // วันหมดอายุ[เดือน]
    String getCardExpMonth();
    void setCardExpMonth(String cardExpMonth);

    // วันหมดอายุ[ปี]
    String getCardExpYear();
    void setCardExpYear(String cardExpYear);

    // เลขCVV
    Short getCardCVVNo();
    void setCardCVVNo(Short cardCVVNo);

    // จำนวนเงินที่เหลือ
    Double getAmount();
    void setAmount(Double amount);
}
