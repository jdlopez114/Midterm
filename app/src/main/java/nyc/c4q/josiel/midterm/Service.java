package nyc.c4q.josiel.midterm;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/AudioTrack.json")
    Call<Response> getResponse();
}

