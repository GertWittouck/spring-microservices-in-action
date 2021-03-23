package com.thoughtmechinics.licensingservice.controllers;

import com.thoughtmechinics.licensingservice.model.License;
import com.thoughtmechinics.licensingservice.services.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    private final LicenseService licenseService;

    @RequestMapping(value="/",method = GET)
    public List<License> getLicenses(@PathVariable("organizationId") String organizationId) {
        return licenseService.getLicensesByOrg(organizationId);
    }

    @RequestMapping(value="/{licenseId}",method = GET)
    public License getLicenses( @PathVariable("organizationId") String organizationId,
                                @PathVariable("licenseId") String licenseId) {
        return licenseService.getLicense(organizationId,licenseId);
    }

    @RequestMapping(value="{licenseId}",method = PUT)
    public String updateLicenses(@PathVariable String organizationId,
                                 @PathVariable("licenseId") String licenseId) {
        return String.format("This is the put with license ID %s and organization ID %s", licenseId, organizationId);
    }

    @RequestMapping(value="/",method = POST)
    public void saveLicenses(@RequestBody License license) {
        licenseService.saveLicense(license);
    }

    @RequestMapping(value="{licenseId}",method = DELETE)
    @ResponseStatus(NO_CONTENT)
    public String deleteLicenses(@PathVariable String organizationId,
                                 @PathVariable("licenseId") String licenseId) {
        return String.format("This is the Delete with license ID %s and organization ID %s", licenseId, organizationId);
    }
}
