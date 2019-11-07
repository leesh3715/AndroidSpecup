package com.example.user.myapplication;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sdm93 on 2018-09-21.
 */
public  class ValidateRequest extends StringRequest {

    final  static private String URL = "HTTP://sdm93.cafe24.com/UserRegister.php ";
    private Map<String, String> parameters;

    public ValidateRequest(String userID, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
    }
    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
