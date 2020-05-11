package com.example.mvpsimplemovieapp.UI;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpsimplemovieapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
//    TODO (7)
// نفذ الانترفيس هنا ف الفيو علشان تربطه بالبريزنتر عن طريق الكونستراكتور بتاعه
public class MainActivity extends AppCompatActivity implements View.OnClickListener, MovieInterface{
    @BindView(R.id.tvname)
    TextView tvname;
    @BindView(R.id.tvdate)
    TextView tvdate;
    @BindView(R.id.tvdispcription)
    TextView tvdispcription;
    @BindView(R.id.getdatabtn)
    Button getdatabtn;
    MoviePresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//    TODO (8)
//        عرف البريزنتر
        mPresenter = new MoviePresenter(this);
        getdatabtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.getdatabtn){
//                TODO (9)
//            البريزنتر هنا بيشتغل عنطريقه ضغطه زرار
            mPresenter.getMovieDetails();
        }
    }

    @Override
    public void onGetMovieDetails(String movieName, String movieDate, String movieDispcription) {

//           TODO (10)
//        اخر حاجه عن طريق الانترفيس بستقبل الداتا وبعرضها علي الشاشه
        tvname.setText(movieName);
        tvdate.setText(movieDate);
        tvdispcription.setText(movieDispcription);
    }
}
