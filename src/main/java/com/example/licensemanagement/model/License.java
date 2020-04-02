package com.example.licensemanagement.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * this class only for map the model from LicenseManagement
 * Class should be serializeable as they need to serialized by redis to json and vice versa
 */
@Getter
@Setter
public class License implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1665610291412023709L;

    private Integer id = 0;

    private int userId = 0;

    private String licenseContent = "";
    
    private String licenseType = "";

    private Date licenseExpired;
}