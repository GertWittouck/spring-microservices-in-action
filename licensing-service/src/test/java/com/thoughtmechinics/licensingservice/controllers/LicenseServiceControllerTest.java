package com.thoughtmechinics.licensingservice.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = { LicenseServiceController.class })
public class LicenseServiceControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getLicenses() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/v1/organizations/TestOrg/licenses/1"))
                .andExpect(status().isOk())
                .andReturn();

        String content = result.getResponse().getContentAsString();
        assertThat(content).isNotNull();
        assertThat(content).isEqualTo(getExpectedResponse());
    }

    private String getExpectedResponse() {
        return "{" +
                "\"licenseId\":\"1\"," +
                "\"organizationId\":\"TestOrg\"," +
                "\"productName\":\"Teleco\"," +
                "\"licenseType\":\"Seat\"" +
                "}";
    }
}