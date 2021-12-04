package com;

import com.google.gson.annotations.SerializedName;

public class Covid {
    @SerializedName("continent")
    private String CountryName;
    @SerializedName("cases")
    private String Cases;
    @SerializedName("recovered")
    private String recovered;

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getCases() {
        return Cases;
    }

    public void setCases(String cases) {
        Cases = cases;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }
}
