package com.example.project_text.data.okhttp;

import com.example.project_text.data.entity.HttpResult;
import com.example.project_text.data.entity.User;
import com.example.project_text.view.AppConstant;
import java.util.Map;
import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @POST(AppConstant.REGISTER)
    @FormUrlEncoded
    Observable<HttpResult<User>> register(@FieldMap Map<String,String> params);

    @POST(AppConstant.LOGIN)
    @FormUrlEncoded
    Observable<HttpResult<User>> login(@FieldMap Map<String,String> params);


}
