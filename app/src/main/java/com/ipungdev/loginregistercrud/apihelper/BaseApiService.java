package com.ipungdev.loginregistercrud.apihelper;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class BaseApiService {

    @FormUrlEncoded
    @POST("login")
    public Call<ResponseBody> loginRequest(@Field("email") String email,
                                           @Field("password") String password) {
        return null;
    }

    @FormUrlEncoded
    @POST("register")
    public Call<ResponseBody> registerRequest(@Field("name") String name,
                                       @Field("email") String email,
                                       @Field("password") String password){
        return null;
    }


}
