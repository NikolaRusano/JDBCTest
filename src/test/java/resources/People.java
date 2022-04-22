package resources;

public class People {
    private String peopleINN, peopleLastName, peopleFirstName, peopleMiddleName,peopleFullName,
    peopleBirthday;
    private  short peopleGender;
    private String peopleLogin, peopleEmail, peopleDomain, peopleCity, peopleAddress, peopleInnerPhone, peopleWorkPhone,
    peopleMobilePhone;
    private  short peopleRefusedFromInn;
    private String peopleFullLogin, globalUserId, dateWorkExperience, nonResident;


    public People(String peopleINN, String peopleLastName, String peopleFirstName, String peopleMiddleName, String peopleFullName,
                  String peopleBirthday, short peopleGender, String peopleLogin, String peopleEmail,
                  String peopleDomain, String peopleCity, String peopleAddress, String peopleInnerPhone,
                  String peopleWorkPhone, String peopleMobilePhone, short peopleRefusedFromInn, String peopleFullLogin,
                  String globalUserId, String dateWorkExperience, String nonResident) {
        this.peopleINN = peopleINN;
        this.peopleLastName = peopleLastName;
        this.peopleFirstName = peopleFirstName;
        this.peopleMiddleName = peopleMiddleName;
        this.peopleFullName = peopleFullName;
        this.peopleBirthday = peopleBirthday;
        this.peopleGender = peopleGender;
        this.peopleLogin = peopleLogin;
        this.peopleEmail = peopleEmail;
        this.peopleDomain = peopleDomain;
        this.peopleCity = peopleCity;
        this.peopleAddress = peopleAddress;
        this.peopleInnerPhone = peopleInnerPhone;
        this.peopleWorkPhone = peopleWorkPhone;
        this.peopleMobilePhone = peopleMobilePhone;
        this.peopleRefusedFromInn = peopleRefusedFromInn;
        this.peopleFullLogin = peopleFullLogin;
        this.globalUserId = globalUserId;
        this.dateWorkExperience = dateWorkExperience;
        this.nonResident = nonResident;
    }

    public People(String nonResident, String peopleINN, String peopleDomain, String peopleCity, String globalUserId, String globalUserId1, String peopleEmail, String peopleLogin, String peopleLastName, String peopleAddress, String peopleInnerPhone, String peopleBirthday, short peopleRefusedFromInn, String peopleWorkPhone, String peopleFullName, String peopleMiddleName, String globalUserId2, String globalUserId3, short peopleGender, String dateWorkExperience) {
    }

    public String getPeopleINN() {
        return peopleINN;
    }

    public void setPeopleINN(String peopleINN) {
        this.peopleINN = peopleINN;
    }

    public String getPeopleLastName() {
        return peopleLastName;
    }

    public void setPeopleLastName(String peopleLastName) {
        this.peopleLastName = peopleLastName;
    }

    public String getPeopleFirstName() {
        return peopleFirstName;
    }

    public void setPeopleFirstName(String peopleFirstName) {
        this.peopleFirstName = peopleFirstName;
    }

    public String getPeopleMiddleName() {
        return peopleMiddleName;
    }

    public void setPeopleMiddleName(String peopleMiddleName) {
        this.peopleMiddleName = peopleMiddleName;
    }

    public String getPeopleFullName() {
        return peopleFullName;
    }

    public void setPeopleFullName(String peopleFullName) {
        this.peopleFullName = peopleFullName;
    }

    public String getPeopleBirthday() {
        return peopleBirthday;
    }

    public void setPeopleBirthday(String peopleBirthday) {
        this.peopleBirthday = peopleBirthday;
    }

    public short getPeopleGender() {
        return peopleGender;
    }

    public void setPeopleGender(short peopleGender) {
        this.peopleGender = peopleGender;
    }

    public String getPeopleLogin() {
        return peopleLogin;
    }

    public void setPeopleLogin(String peopleLogin) {
        this.peopleLogin = peopleLogin;
    }

    public String getPeopleEmail() {
        return peopleEmail;
    }

    public void setPeopleEmail(String peopleEmail) {
        this.peopleEmail = peopleEmail;
    }

    public String getPeopleDomain() {
        return peopleDomain;
    }

    public void setPeopleDomain(String peopleDomain) {
        this.peopleDomain = peopleDomain;
    }

    public String getPeopleCity() {
        return peopleCity;
    }

    public void setPeopleCity(String peopleCity) {
        this.peopleCity = peopleCity;
    }

    public String getPeopleAddress() {
        return peopleAddress;
    }

    public void setPeopleAddress(String peopleAddress) {
        this.peopleAddress = peopleAddress;
    }

    public String getPeopleInnerPhone() {
        return peopleInnerPhone;
    }

    public void setPeopleInnerPhone(String peopleInnerPhone) {
        this.peopleInnerPhone = peopleInnerPhone;
    }

    public String getPeopleWorkPhone() {
        return peopleWorkPhone;
    }

    public void setPeopleWorkPhone(String peopleWorkPhone) {
        this.peopleWorkPhone = peopleWorkPhone;
    }

    public String getPeopleMobilePhone() {
        return peopleMobilePhone;
    }

    public void setPeopleMobilePhone(String peopleMobilePhone) {
        this.peopleMobilePhone = peopleMobilePhone;
    }

    public short getPeopleRefusedFromInn() {
        return peopleRefusedFromInn;
    }

    public void setPeopleRefusedFromInn(short peopleRefusedFromInn) {
        this.peopleRefusedFromInn = peopleRefusedFromInn;
    }

    public String getPeopleFullLogin() {
        return peopleFullLogin;
    }

    public void setPeopleFullLogin(String peopleFullLogin) {
        this.peopleFullLogin = peopleFullLogin;
    }

    public String getGlobalUserId() {
        return globalUserId;
    }

    public void setGlobalUserId(String globalUserId) {
        this.globalUserId = globalUserId;
    }

    public String getDateWorkExperience() {
        return dateWorkExperience;
    }

    public void setDateWorkExperience(String dateWorkExperience) {
        this.dateWorkExperience = dateWorkExperience;
    }

    public String getNonResident() {
        return nonResident;
    }

    public void setNonResident(String nonResident) {
        this.nonResident = nonResident;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleINN='" + peopleINN + '\'' +
                ", peopleLastName='" + peopleLastName + '\'' +
                ", peopleFirstName='" + peopleFirstName + '\'' +
                ", peopleMiddleName='" + peopleMiddleName + '\'' +
                ", peopleFullName='" + peopleFullName + '\'' +
                ", peopleBirthday='" + peopleBirthday + '\'' +
                ", peopleGender=" + peopleGender +
                ", peopleLogin='" + peopleLogin + '\'' +
                ", peopleEmail='" + peopleEmail + '\'' +
                ", peopleDomain='" + peopleDomain + '\'' +
                ", peopleCity='" + peopleCity + '\'' +
                ", peopleAddress='" + peopleAddress + '\'' +
                ", peopleInnerPhone='" + peopleInnerPhone + '\'' +
                ", peopleWorkPhone='" + peopleWorkPhone + '\'' +
                ", peopleMobilePhone='" + peopleMobilePhone + '\'' +
                ", peopleRefusedFromInn=" + peopleRefusedFromInn +
                ", peopleFullLogin='" + peopleFullLogin + '\'' +
                ", globalUserId='" + globalUserId + '\'' +
                ", dateWorkExperience='" + dateWorkExperience + '\'' +
                ", nonResident='" + nonResident + '\'' +
                '}';
    }
}
