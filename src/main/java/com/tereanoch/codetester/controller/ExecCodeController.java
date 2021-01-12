package com.tereanoch.codetester.controller;

import com.tereanoch.codetester.dto.request.ExecCodeRequest;
import com.tereanoch.codetester.dto.response.ExecCodeResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
public class ExecCodeController {

    @RequestMapping(method = RequestMethod.POST, value = Constants.BASE_URL + "/code/execute")
    public ExecCodeResponse greeting(@RequestBody ExecCodeRequest request, HttpServletRequest httpServletRequest) {

        return new ExecCodeResponse();
    }
}
