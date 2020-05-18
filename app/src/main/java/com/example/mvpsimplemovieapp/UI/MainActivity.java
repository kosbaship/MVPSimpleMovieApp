package com.example.mvpsimplemovieapp.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvpsimplemovieapp.Models.MovieModel;
import com.example.mvpsimplemovieapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R.id.tvname)
    TextView tvname;
    @BindView(R.id.tvdate)
    TextView tvdate;
    @BindView(R.id.tvdispcription)
    TextView tvdispcription;
    @BindView(R.id.getdatabtn)
    Button getdatabtn;

    MovieViewModel mMovieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        getdatabtn.setOnClickListener(this);

        //    TODO (7)
//عرف اسم للفيومودل فوق وتعال اربطه بان الاكتفتي دي تسنط عليه عن طريق البروفايدر
        mMovieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        //                TODO (9)
// اتسنط علي الداتا اللي دوا الميوتابل لايف داتا ونقي منها معلوماتك واعرضها علي الفيو بمزاجك
        mMovieViewModel.mMovieViewModelMutableLiveData.observe(this, new Observer<MovieModel>() {
            @Override
            public void onChanged(MovieModel mMovieModel) {
                String name = mMovieModel.getmMoviewName();
                String date = mMovieModel.getmMoviewDate();
                String description = mMovieModel.getmMoviewDescription();
                tvname.setText(name);
                tvdate.setText(date);
                tvdispcription.setText(description);
            }
        });

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.getdatabtn){
            //                TODO (8)
// خلي لما ندوس علي الزرار يخلي الفيومودل يجيب الداتا من الداتابيز وقول انا جبت داتا ولو اي حد بيتسنط يخدها
            mMovieViewModel.getMovieDetails();
        }
    }


}

