package com.solvd.carina.demo.api.homework;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;


@Endpoint(url = "${base_url}/posts", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/homework/get/allposts.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAllPosts extends AbstractApiMethodV2 {
    public GetAllPosts() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}