public interface PayD {
    Long getCreditCardNo();
    void setCreditCardNo(Long creditCardNo);

    String getCustomerName();
    void setCustomerName(String customerName);

    String getCardExpDate();
    void setCardExpDate(String cardExpDate);

    Short getCardCVVNo();
    void setCardCVVNo(Short cardCVVNo);

    Double getAmount();
    void setAmount(Double amount);
}
