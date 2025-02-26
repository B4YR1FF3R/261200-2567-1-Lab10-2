public class XpayImpl implements Xpay {

    // กำหนดตัวแปร ในเครดิตการ์ดใช้อะไรบ้าง
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private Short cardCVVNo;
    private Double amount;

    // -------------เลขเครดิตการ์ด---------------------//
    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    //--------------------------------------------//

    //----------------ชื่อคนถือบัตร-------------------//
    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //--------------------------------------------//

    //--------------วันหมดอายุ[เดือน]-----------------//
    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    //--------------------------------------------//

    //------------วันหมดอายุ[ปี]---------------------//
    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    //-------------------------------------------//

    //-------------------เลขCVV------------------//
    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    //------------------------------------------//

    //-------------จำนวนเงินที่เหลือ------------------//
    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    //-------------------------------------------//
}
