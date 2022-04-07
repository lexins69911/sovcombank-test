package com.example.emailsender.pojo;

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

    @JsonProperty("email_address")
    private String emailAddress;

    private Message message;

}
