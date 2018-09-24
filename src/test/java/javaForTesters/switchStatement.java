package javaForTesters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class switchStatement {

    @Test
    public void switchExample() {
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("M", likelyGenderIs("master"));

        assertEquals("F", likelyGenderIs("miss"));
        assertEquals("F", likelyGenderIs("mrs"));
        assertEquals("F", likelyGenderIs("ms"));
        assertEquals("F", likelyGenderIs("lady"));
        assertEquals("F", likelyGenderIs("madam"));
    }

    private String likelyGenderIs(String title) {
        String likelyGender;

        switch (title.toLowerCase()) {
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }


    @Test
    public void shirtSizes() {
        assertEquals("Small", likelySizeIs("XS"));
        assertEquals("Small", likelySizeIs("S"));

        assertEquals("Medium", likelySizeIs("M"));

        assertEquals("Large", likelySizeIs("L"));
        assertEquals("Large", likelySizeIs("XL"));

        assertEquals("Extra Large", likelySizeIs("XLL"));
    }

    private String likelySizeIs(String size) {
        String likelySize;

        switch (size.toLowerCase()) {
            case "xs":
                likelySize = "Small";
                break;
            case "s":
                likelySize = "Small";
                break;
            case "m":
                likelySize = "Medium";
                break;
            case "xll":
                likelySize = "Extra Large";
                break;
            default:
                likelySize = "Large";
                break;
        }
        return likelySize;
    }

    @Test
    public void countryShortCode() {
        assertEquals("IN", likelyCountryName("India"));
        assertEquals("US", likelyCountryName("United States"));
        assertEquals("US", likelyCountryName("United States of America"));
        assertEquals("UK", likelyCountryName("United Kingdom"));
        assertEquals("ROW", likelyCountryName("Rest of World"));
    }

    private String likelyCountryName(String countryName) {
        String likelyCountry;

        switch (countryName.toLowerCase()) {
            case "india":
                likelyCountry = "IN";
                break;
            case "united states":
                likelyCountry = "US";
                break;
            case "united states of america":
                likelyCountry = "US";
                break;
            case "united kingdom":
                likelyCountry = "UK";
                break;
            default:
                likelyCountry = "ROW";
                break;
        }

        return likelyCountry;
    }

}
