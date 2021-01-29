package com.thoughtmechinics.licensingservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class License {

    private String licenseId;
    private String organizationId;
    private String productName;
    private String licenseType;

    public License withId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    public License withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public License withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    public License withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
}
