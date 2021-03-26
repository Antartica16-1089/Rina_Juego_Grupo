package com.example.headsup_duros.services;

import com.example.headsup_duros.models.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CategoryService {
    String API_ROUTE = "/Antartica16-1089/demo/master/db.json";

    @GET(API_ROUTE)
    Call<List<Category>> getCategories();
}
