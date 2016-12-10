package nyc.c4q.josiel.midterm;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.*;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    String userList; // need a list of songs for the adapter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchResponse();
    }


    private void fetchResponse() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://vine.co/api/timelines/users/918753190470619136") // this is the beginning to our url
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Service service = retrofit.create(Service.class);

        Call<Response> call = service.getResponse();
        call.enqueue(new Callback<Response>() {

            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response respon = response.body();
                User user= respon.getUser();
                Likes likes = respon.getLikes();
                userList = user.getUsername();
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });
    }

}

