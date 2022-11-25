package API.pojos.pojos;

public class InnerPhysiciansPojo {
    /*
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-11-16T11:34:56.255348Z",
        "id": 302628,
        "login": "kevser",
        "firstName": "Kevser",
        "lastName": "Kevser",
        "email": "kevser@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "111-33-9999"
    },
     */
     private String createdBy;
     private String createdDate;
     private String login;
     private String firstName;
     private String lastName;
     private String email;
     private Boolean activated;
     private String langKey ;
     private Object imageUrl;
     private Object resetDate;
     private String ssn;

    @Override
    public String toString() {
        return "InnerPhysiciansPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", imageUrl=" + imageUrl +
                ", resetDate=" + resetDate +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getResetDate() {
        return resetDate;
    }

    public void setResetDate(Object resetDate) {
        this.resetDate = resetDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public InnerPhysiciansPojo() {
    }

    public InnerPhysiciansPojo(String createdBy, String createdDate, String login, String firstName, String lastName, String email, Boolean activated, String langKey, Object imageUrl, Object resetDate, String ssn) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.activated = activated;
        this.langKey = langKey;
        this.imageUrl = imageUrl;
        this.resetDate = resetDate;
        this.ssn = ssn;
    }
    /*
    {
    "createdBy": "team17",
    "createdDate": "2022-11-16T11:43:20.095631Z",
    "id": 301049,
    "firstName": "Kevser",
    "lastName": "Kevser",
    "birthDate": "1989-09-14T21:00:00Z",
    "phone": "5556667788",
    "gender": "MALE",
    "bloodGroup": "Apositive",
    "adress": "",
    "description": "",
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-11-16T11:34:56.255348Z",
        "id": 302628,
        "login": "kevser",
        "firstName": "Kevser",
        "lastName": "Kevser",
        "email": "kevser@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "111-33-9999"
    },
    "speciality": "DERMATOLOGY",
    "appointments": null,
    "country": null,
    "cstate": null,
    "examFee": 500.00,
    "image": "",
    "imageContentType": null
}
     */
}
