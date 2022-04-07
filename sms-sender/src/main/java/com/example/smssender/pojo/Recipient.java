package com.example.smssender.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Recipient {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("message_body")
    private String messageBody;

}
