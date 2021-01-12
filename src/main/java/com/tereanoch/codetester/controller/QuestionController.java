package com.tereanoch.codetester.controller;

import com.tereanoch.codetester.dto.request.ExecCodeRequest;
import com.tereanoch.codetester.dto.response.ExecCodeResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class QuestionController {

    @RequestMapping(method = RequestMethod.GET, value = Constants.BASE_URL + "/code/execute")
    public ExecCodeResponse greeting(@RequestBody ExecCodeRequest request, HttpServletRequest httpServletRequest) {

        return new ExecCodeResponse();
    }
}