package com.example.volleyjson;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingletonVolley {
    private static SingletonVolley mSingletonVolley;
    private RequestQueue mRequest;

    private SingletonVolley(Context context){
        mRequest = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized SingletonVolley getInstance(Context context){
        if (mSingletonVolley == null){
            mSingletonVolley = new SingletonVolley(context);
        }
        return mSingletonVolley;
    }

    public RequestQueue getmRequest(){
        return mRequest;
    }
}
