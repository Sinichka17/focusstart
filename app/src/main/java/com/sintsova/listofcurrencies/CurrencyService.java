package com.sintsova.listofcurrencies;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CurrencyService {
    @GET("/user/{id}")
    Call<User> getUserById(@Path("id") String id);
}
class User {
}

class CurrencyRepository {
    private CurrencyService userService;

    public CurrencyRepository(CurrencyService userService) {
        this.userService = userService;
    }

    //public Call<User> getUserById(String id) {
    //    return userService.getUser(id);
   // }
}