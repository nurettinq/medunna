package API.pojos.pojos;

public class PhysiciansPojo {
    private String createdBy;
    private String createdDate;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String description;
    private InnerPhysiciansPojo user;
    private String speciality;
    private Object country;
    private Object appointments;
    private Object cstate;
    private Double examFee;
    private String image;
    private Object imageContentType;

    @Override
    public String toString() {
        return "PhysiciansPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", speciality='" + speciality + '\'' +
                ", country=" + country +
                ", appointments=" + appointments +
                ", cstate=" + cstate +
                ", examFee=" + examFee +
                ", image='" + image + '\'' +
                ", imageContentType=" + imageContentType +
                '}';
    }

    public PhysiciansPojo() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InnerPhysiciansPojo getUser() {
        return user;
    }

    public void setUser(InnerPhysiciansPojo user) {
        this.user = user;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Object getAppointments() {
        return appointments;
    }

    public void setAppointments(Object appointments) {
        this.appointments = appointments;
    }

    public Object getCstate() {
        return cstate;
    }

    public void setCstate(Object cstate) {
        this.cstate = cstate;
    }

    public Double getExamFee() {
        return examFee;
    }

    public void setExamFee(Double examFee) {
        this.examFee = examFee;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Object getImageContentType() {
        return imageContentType;
    }

    public void setImageContentType(Object imageContentType) {
        this.imageContentType = imageContentType;
    }

    public PhysiciansPojo(String createdBy, String createdDate, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress, String description, InnerPhysiciansPojo user, String speciality, Object country, Object appointments, Object cstate, Double examFee, String image, Object imageContentType) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.description = description;
        this.user = user;
        this.speciality = speciality;
        this.country = country;
        this.appointments = appointments;
        this.cstate = cstate;
        this.examFee = examFee;
        this.image = image;
        this.imageContentType = imageContentType;
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

   }*/
}
