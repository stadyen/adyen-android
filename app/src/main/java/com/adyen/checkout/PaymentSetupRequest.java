package com.adyen.checkout;

import com.adyen.core.models.Amount;

public class PaymentSetupRequest {

    private Amount amount;
    private String shopperLocale;
    private String merchantAccount;
    private String countryCode;
    private String maxNumberOfInstallments;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(final Amount amount) {
        this.amount = amount;
    }

    public String getShopperLocale() {
        return shopperLocale;
    }

    public void setShopperLocale(final String shopperLocale) {
        this.shopperLocale = shopperLocale;
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(final String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMaxNumberOfInstallments() {
        return maxNumberOfInstallments;
    }

    public void setMaxNumberOfInstallments(final String maxNumberOfInstallments) {
        this.maxNumberOfInstallments = maxNumberOfInstallments;
    }

}
