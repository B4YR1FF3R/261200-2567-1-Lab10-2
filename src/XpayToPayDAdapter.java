public class XpayToPayDAdapter implements PayD {
    // ห้ามแก้ไข
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    // -------------เลขเครดิตการ์ด---------------------//
    @Override
    public Long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public void setCreditCardNo(Long creditCardNo) {
        xpay.setCreditCardNo(String.valueOf(creditCardNo));
    }

    //--------------------------------------------//

    //----------------ชื่อคนถือบัตร-------------------//
    @Override
    public String getCustomerName() {
        return xpay.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        xpay.setCustomerName(customerName);
    }

    //--------------------------------------------//

    //-----------------วันหมดอายุ-------------------//
    @Override
    public String getCardExpDate() {
        return xpay.getCardExpMonth() + "/" + xpay.getCardExpYear();
    }

    @Override
    public void setCardExpDate(String cardExpDate) {
        String[] parts = cardExpDate.split("/");
        if (parts.length == 2) {
            xpay.setCardExpMonth(parts[0]);
            xpay.setCardExpYear(parts[1]);
        }
    }

    //--------------------------------------------//

    //-------------------เลขCVV-------------------//
    @Override
    public Short getCardCVVNo() {
        return xpay.getCardCVVNo();
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        xpay.setCardCVVNo(cardCVVNo);
    }

    //------------------------------------------//

    //-------------จำนวนเงินที่เหลือ------------------//
    @Override
    public Double getAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setAmount(Double amount) {
        xpay.setAmount(amount);
    }

    //-------------------------------------------//
}
