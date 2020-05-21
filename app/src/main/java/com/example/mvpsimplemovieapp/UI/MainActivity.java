package com.example.mvpsimplemovieapp.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mvpsimplemovieapp.Models.MovieModel;
import com.example.mvpsimplemovieapp.R;
import com.example.mvpsimplemovieapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
public class MainActivity extends AppCompatActivity{

    MovieViewModel mMovieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.recyclerviewtag.setLayoutManager(new LinearLayoutManager(this));
        final MovieListAdapter adapter = new MovieListAdapter();
        binding.recyclerviewtag.setAdapter(adapter);


        binding.getdatabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMovieViewModel.getMovieDetails();

            }
        });



        //    TODO (7)
//عرف اسم للفيومودل فوق وتعال اربطه بان الاكتفتي دي تسنط عليه عن طريق البروفايدر
        mMovieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        //                TODO (9)
// اتسنط علي الداتا اللي دوا الميوتابل لايف داتا ونقي منها معلوماتك واعرضها علي الفيو بمزاجك
        mMovieViewModel.mMovieViewModelMutableLiveData.observe(this, new Observer<ArrayList<MovieModel>>() {
            @Override
            public void onChanged(ArrayList<MovieModel> movieModels) {
                adapter.setArrayList(movieModels);
            }
        });

    }



}

