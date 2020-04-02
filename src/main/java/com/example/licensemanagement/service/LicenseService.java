package com.example.licensemanagement.service;

import java.util.List;

import com.example.licensemanagement.model.License;

/**
 * Interface ini harus di salin ke client-side RPC 
 * perlu diperhatikan bahwa nama package hingga isi interface diharuskan sama persis
 */
public interface LicenseService {
    List<License> getLicenses();
    License getById(Long id);
}