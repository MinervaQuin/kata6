/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata6;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Minerva
 */

@XmlRootElement
@XmlType(propOrder={"id", "name", "brewery_type", "street",
    "address_2",
    "address_3", 
    "city", 
    "state", 
    "county_province", 
    "postal_code",
    "country",
    "longitude", 
    "latitude", 
    "phone", 
    "website_url", 
    "updated_at", 
    "created_at"
})


public class Brewerie {
    private String id;
    private String name;
    private String brewery_type;
    private String street;
    private String address_2;
    private String address_3;
    private String city;
    private String state;
    private String county_province;
    private String postal_code;
    private String country;
    private String longitude;
    private String latitude;
    private String phone;
    private String website_url;
    private String updated_at;
    private String created_at;

    public Brewerie(String id, String name, String brewery_type, String street, String address_2, String address_3, String city, String state, String county_province, String postal_code, String country, String longitude, String latitude, String phone, String website_url, String updated_at, String created_at) {
        this.id = id;
        this.name = name;
        this.brewery_type = brewery_type;
        this.street = street;
        this.address_2 = address_2;
        this.address_3 = address_3;
        this.city = city;
        this.state = state;
        this.county_province = county_province;
        this.postal_code = postal_code;
        this.country = country;
        this.longitude = longitude;
        this.latitude = latitude;
        this.phone = phone;
        this.website_url = website_url;
        this.updated_at = updated_at;
        this.created_at = created_at;
    }

   
    public Brewerie(){
        
    }
    

    @XmlElement
    public String getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public String getBrewery_type() {
        return brewery_type;
    }
    
    @XmlElement
    public String getStreet() {
        return street;
    }
    
    @XmlElement
    public String getAddress_2() {
        return address_2;
    }

    @XmlElement
    public String getAddress_3() {
        return address_3;
    }

    @XmlElement
    public String getCity() {
        return city;
    }

    @XmlElement
    public String getState() {
        return state;
    }

    @XmlElement
    public String getCounty_province() {
        return county_province;
    }

    @XmlElement
    public String getPostal_code() {
        return postal_code;
    }

    @XmlElement
    public String getCountry() {
        return country;
    }

    @XmlElement
    public String getLongitude() {
        return longitude;
    }

    @XmlElement
    public String getLatitude() {
        return latitude;
    }

    @XmlElement
    public String getPhone() {
        return phone;
    }

    @XmlElement
    public String getWebsite_url() {
        return website_url;
    }

    @XmlElement
    public String getUpdated_at() {
        return updated_at;
    }

    @XmlElement
    public String getCreated_at() {
        return created_at;
    }
    
     @Override
    public String toString() {
       
        return "Id: " + id + "\n" +
                "Name: " + name + "\n" + 
                "brewery_type: " + this.brewery_type + "\n"+ 
                getAddreses() + 
                "City: " + city + "\n" +
                "State: " + state + "\n" +
                "County_province: " + this.county_province + "\n" +
                "Postal_code: " + this.postal_code + "\n" +
                "County: " + country + "\n" +
                "Longitude: " + longitude + "\n" +                
                "Latitude: " + latitude + "\n" +
                "Phone: " + phone + "\n" +
                "Website: " + this.website_url + "\n" + 
                "Updated_At: " + this.updated_at + "\n" +
                "Created_At: " + this.created_at + "\n" ;
        }
    
    
    public String getAddreses(){
        String addresses ="";
        if (this.street != null){
            addresses += "street: " + street + "\n";
        }
        if (this.address_2 != null){
            addresses += "2nd Address: " +address_2 + "\n";
        }
        if (this.address_3 != null){
            addresses += "3rd Address: " +address_3 + "\n";
        }
        return addresses;
    }
    
    
    
}
