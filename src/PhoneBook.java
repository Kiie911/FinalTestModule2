import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook implements Serializable {
    private String name;
    private int phoneNumber;
    private String address;
    private String email;
    private String facebook;

    public PhoneBook(String name, int phoneNumber, String facebook, String email, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.facebook = facebook;
        this.email = email;
        this.address = address;
    }

    public PhoneBook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Phone: "+phoneNumber+", Facebook: "+facebook+", Email:"+email+",  Address: "+ address;
    }
}
