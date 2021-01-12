package com.tereanoch.codetester.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ExecCodeResponse {
    public boolean passed = true;
    public String errorMessage = "test";
}
