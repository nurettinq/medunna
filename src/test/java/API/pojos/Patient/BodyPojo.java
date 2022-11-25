package API.pojos.Patient;

public class BodyPojo {
    private String createdBy;
    private String createdDate;
    private Integer id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String email;
    private String description;
    private InnerUserPojo user;
    private Object appointments;
    private Object inPatients;
    private InnerCountryPojo country;
    private Object cstate;

    @Override
    public String toString() {
        return "BodyPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", appointments=" + appointments +
                ", inPatients=" + inPatients +
                ", country=" + country +
                ", cstate=" + cstate +
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InnerUserPojo getUser() {
        return user;
    }

    public void setUser(InnerUserPojo user) {
        this.user = user;
    }

    public Object getAppointments() {
        return appointments;
    }

    public void setAppointments(Object appointments) {
        this.appointments = appointments;
    }

    public Object getInPatients() {
        return inPatients;
    }

    public void setInPatients(Object inPatients) {
        this.inPatients = inPatients;
    }

    public InnerCountryPojo getCountry() {
        return country;
    }

    public void setCountry(InnerCountryPojo country) {
        this.country = country;
    }

    public Object getCstate() {
        return cstate;
    }

    public void setCstate(Object cstate) {
        this.cstate = cstate;
    }

    public BodyPojo() {
    }

    public BodyPojo(String createdBy, String createdDate, Integer id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String email, String description, InnerUserPojo user, Object appointments, Object inPatients, InnerCountryPojo country, Object cstate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.email = email;
        this.description = description;
        this.user = user;
        this.appointments = appointments;
        this.inPatients = inPatients;
        this.country = country;
        this.cstate = cstate;
    }
    /*
    {
    "createdBy": "team_09",
    "createdDate": "2022-11-17T20:48:52.149223Z",
    "id": 307396,
    "firstName": "hastateam09",
    "lastName": "team09",
    "birthDate": "2018-01-16T21:00:00Z",
    "phone": "2222222222",
    "gender": "FEMALE",
    "bloodGroup": "Apositive",
    "adress": "Gul Sokak",
    "email": "hastateam09@gmail.com",
    "description": "Oncelikli hasta",
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2022-07-17T21:28:02.127739Z",
        "id": 127072,
        "login": "team83_steven.pagac",
        "firstName": "Team83_Flora",
        "lastName": "PostRequest_Torp",
        "email": "team83_josue.schoen@hotmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "830-97-7748"
    },
    "appointments": null,
    "inPatients": null,
    "country": {
        "id": 80065,
        "name": "USA"
    },
    "cstate": null
}
     */
}
