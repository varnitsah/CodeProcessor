package com.tereanoch.codetester.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExecCodeRequest {

    private String language;
    private String code;
}
