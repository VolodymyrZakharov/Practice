package rest_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer countryCode;
    private Integer phoneNumber;

    @ManyToOne
    private Person person;

    public PhoneNumber() {
    }

    public PhoneNumber(Integer countryCode, Integer phoneNumber, Person person) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.person = person;
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

    public Person getPerson() {
        return person;
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

    public void setPerson(Person person) {
        this.person = person;
    }
}
