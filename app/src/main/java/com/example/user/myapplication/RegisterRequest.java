package com.example.user.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sdm93 on 2018-09-21.
 */
public  class RegisterRequest extends StringRequest {

    final  static private String URL = "HTTP://sdm93.cafe24.com/UserRegister.php ";
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userGender, String userMajor, String userEmail, Response.Listener<String> listener){
        super(Method.POST,URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userGender", userGender);
        parameters.put("userMajor", userMajor);
        parameters.put("userEmail", userEmail);
    }
    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
