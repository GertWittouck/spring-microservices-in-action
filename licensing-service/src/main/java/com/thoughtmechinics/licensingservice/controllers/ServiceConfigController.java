package com.thoughtmechinics.licensingservice.controllers;

import com.thoughtmechinics.licensingservice.config.ServiceConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/v1/configuration")
@RequiredArgsConstructor
public class ServiceConfigController {

    private final ServiceConfig serviceConfig;

    @RequestMapping(value = "/example-property", method = GET)
    public String getExampleProperty() {
        return serviceConfig.getExampleProperty();
    }
}
