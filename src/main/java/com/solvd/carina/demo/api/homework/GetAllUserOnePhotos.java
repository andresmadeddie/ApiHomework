package com.solvd.carina.demo.api.homework;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/albums/1/photos", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/homework/get/alluseronephotos.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetAllUserOnePhotos extends AbstractApiMethodV2 {
    public GetAllUserOnePhotos() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}