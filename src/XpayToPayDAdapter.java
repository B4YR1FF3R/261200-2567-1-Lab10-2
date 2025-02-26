public class XpayToPayDAdapter implements PayD {
    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
    }

    @Override
    public Long getCreditCardNo() {
        return Long.parseLong(xpay.getCreditCardNo());
    }

    @Override
    public void setCreditCardNo(Long creditCardNo) {
        xpay.setCreditCardNo(String.valueOf(creditCardNo));
    }

    @Override
    public String getCustomerName() {
        return xpay.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        xpay.setCustomerName(customerName);
    }

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

    @Override
    public Short getCardCVVNo() {
        return xpay.getCardCVVNo();
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        xpay.setCardCVVNo(cardCVVNo);
    }

    @Override
    public Double getAmount() {
        return xpay.getAmount();
    }

    @Override
    public void setAmount(Double amount) {
        xpay.setAmount(amount);
    }
}
