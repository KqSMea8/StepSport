package com.pic.optimize.http.api;

import com.pic.optimize.http.response.OkHttpCallback;

import org.json.JSONObject;

import okhttp3.Response;

/**
 * Created by ldy on 2015/12/30.
 */
public abstract class OkHttpResJsonHandler extends OkHttpCallback<JSONObject> {

    @Override
    protected JSONObject parseResponse(Response response) throws Throwable {
        return responseToJson(response);
    }
}
