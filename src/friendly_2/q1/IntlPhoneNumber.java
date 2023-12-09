package friendly_2.q1;

public class IntlPhoneNumber extends PhoneNumber {

    private String countryCode;

    public IntlPhoneNumber() {

    }

    public IntlPhoneNumber(String areaCode, String phoneNumber, String countryCode) {
        super(areaCode, phoneNumber);
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return countryCode + '-' + super.getAreaCode().substring(1) + "-" + super.getPhoneNumber();
    }
}
