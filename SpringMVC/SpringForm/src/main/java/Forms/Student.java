package Forms;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryOptions;
    private String favLang;
    private String[] OS;

    Student()
    {
        countryOptions=new LinkedHashMap<>();
        countryOptions.put("IND","India");
        countryOptions.put("BRZ","Brazil");
        countryOptions.put("ARG","Argentina");
        countryOptions.put("GER","Germany");
        countryOptions.put("USA","America");
        countryOptions.put("ENG","England");
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavLang() {
        return favLang;
    }

    public void setFavLang(String favLang) {
        this.favLang = favLang;
    }

    public String[] getOS() {
        return OS;
    }

    public void setOS(String[] OS) {
        this.OS = OS;
    }
}
