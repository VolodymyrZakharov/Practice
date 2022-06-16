package rest_api.dto;

public class PhoneNumberDto {
    public Integer id;
    public Integer countryCode;
    public Integer phoneNumber;
    public Integer personId;

    public PhoneNumberDto() {
    }

    public PhoneNumberDto(Integer id, Integer countryCode, Integer phoneNumber, Integer personId) {
        this.id = id;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}
