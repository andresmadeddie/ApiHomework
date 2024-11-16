package com.solvd.carina.demo.api.homework;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/users/1/todos", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/homework/get/alluseronecontent.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAllUserOneContent extends AbstractApiMethodV2 {
    public GetAllUserOneContent() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}
