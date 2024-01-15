package com.example.chadappfinal.Ulti;

import com.mobile.messageclone.Model.MyResponse;
import com.mobile.messageclone.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAxWAMXyQ:APA91bHH8dKlMIaN0L7o6hIidGOuwgF2HNxBfzpkhkM2cx8cvy1mCsaAIqf-eNTzcYTgKa6ZN6OnJNWNKPdHyCDrdC99g22lBabUE8Qmgh7ixhugnJpOCIuFxK32Ar95nu4DKm7f3oXb"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
