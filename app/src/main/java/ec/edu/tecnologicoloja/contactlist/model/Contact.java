package ec.edu.tecnologicoloja.contactlist.model;


import java.io.Serializable;

public class Contact implements Serializable {
    private String updatedAt;
    private String birthday;
    private String phone;
    private String imageUrl;
    private String email;
    private String objectId;
    private String description;
    private String createdAt;
    private String name;
    private String gender;
    private String country;
    private String city;
    private GeoLocation location;

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public GeoLocation getLocation() { return location;  }




}
