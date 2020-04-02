package com.example.licensemanagement.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.licensemanagement.model.License;
import com.example.licensemanagement.service.LicenseService;

import org.springframework.stereotype.Service;

/**
 * Implementation LicenseService
 */
@Service
public class LicenseServiceImpl implements LicenseService {

    @Override
    public List<License> getLicenses() {

        List<License> licenses = new ArrayList<>();

        for(int i = 0; i < 100000; i++) {
            License license1 = new License();
            license1.setLicenseContent("TEST-12345-TEST-12345");
            license1.setLicenseExpired(new Date());
            license1.setLicenseType(Integer.toString(i));

            licenses.add(license1);
        }

        return licenses;

    }

    @Override
    public License getById(Long id) {
        License license3 = new License();
        license3.setLicenseContent("1234-5678-9000-1234");
        license3.setLicenseExpired(new Date());
        license3.setLicenseType("HOLDING");

        return license3;
    }

}