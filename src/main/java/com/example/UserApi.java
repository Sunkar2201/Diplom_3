package com.example;
import com.example.models.requests.UserCreatePatchRequestModel;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class UserApi extends BaseHttpClient {
    private final String apiPath = "/api/auth";

    @Step("Создание пользователя")
    public Response createUser(String email, String password, String name) {
        UserCreatePatchRequestModel request = new UserCreatePatchRequestModel(email, password, name);

        return doPostRequest(apiPath + "/register", request);
    }

    @Step("Удаление пользователя")
    public Response deleteUser(String token) {
        return doDeleteRequest(apiPath + "/user", token);
    }

    @Step("Получение пользователя")
    public Response getUser(String email, String password) {
        com.example.models.requests.UserGetRequestModel request = new com.example.models.requests.UserGetRequestModel(email, password);

        return doPostRequest(apiPath + "/login", request);
    }
}