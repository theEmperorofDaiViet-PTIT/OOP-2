package friendly_2.q1;

public class PhoneNumber implements Comparable<PhoneNumber>{

    private String areaCode;

    private String phoneNumber;

    public PhoneNumber() {

    }

    public PhoneNumber(String areaCode, String phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return areaCode + '-' + phoneNumber;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return this.toString().compareTo(o.toString());
    }
}
