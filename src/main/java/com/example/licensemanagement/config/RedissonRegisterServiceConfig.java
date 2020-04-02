package com.example.licensemanagement.config;


import javax.annotation.PostConstruct;

import com.example.licensemanagement.service.LicenseService;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonRegisterServiceConfig {
    
    /**
     * Spring boot sudah melakukan auto config terhadap connection redis
     */
    @Autowired
    private RedissonClient redisson;

    /**
     * LicenseService di inject ke configuration agar implementation dari LicenseService
     * dapat digunakan untuk register service
     */
    @Autowired
    private LicenseService licenseService;

    @PostConstruct
    public void register() {
        // mendaftarkan license service agar bisa diakses oleh module lain
        // by default redisson hanya set 1 invocation setiap connection, kita bisa set 
        // invocation dengan menambahkan parameter angka di akhir register
        // redisson hanya mendukung sampai 12 invocation

        // redisson.getRemoteService().register(LicenseService.class, licenseService, 12);
        redisson.getRemoteService().register(LicenseService.class, licenseService);
    }   

}