package com.ipungdev.loginregistercrud.apihelper;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UserService {

    @FormUrlEncoded
    @POST("login")
    public Call<ResponseBody> loginRequest(@Field("email") String email,
                                           @Field("password") String password);

    @FormUrlEncoded
    @POST("register")
    public Call<ResponseBody> registerRequest(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("password_confirmation") String password_confirmation
            );
}
