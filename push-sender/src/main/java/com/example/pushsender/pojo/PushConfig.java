package com.example.pushsender.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PushConfig {

    private String title;
    private String body;
    private String icon;

    @JsonProperty("click_action")
    private String clickAction;

    @JsonProperty("ttl_in_seconds")
    private String ttlInSeconds;

}
