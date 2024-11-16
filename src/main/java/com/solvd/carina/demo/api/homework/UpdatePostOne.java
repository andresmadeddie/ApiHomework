package com.solvd.carina.demo.api.homework;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/posts/1", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/users/homework/put/rq.json")
@ResponseTemplatePath(path = "api/users/homework/put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class UpdatePostOne extends AbstractApiMethodV2 {
    public UpdatePostOne() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}