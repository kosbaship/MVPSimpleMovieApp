package com.example.mvpsimplemovieapp.UI;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvpsimplemovieapp.Models.MovieModel;
//    TODO (3)
// هبني الفيو مودل بتاعي
public class MovieViewModel extends ViewModel {
//     TODO (4)
// هعرف اوبجكت من الداتا اللي ممكن اعدل عليها بايدي
    MutableLiveData<MovieModel> mMovieViewModelMutableLiveData = new MutableLiveData<>();

    //        TODO (6)
//    ابني الداله اللي هتجيب الداتا من الداتابيز وتحطها جاهزه لاي فيو هيتسنط
    public void getMovieDetails(){
        MovieModel mMovieModel = getMovieDetailsFromDB();
        mMovieViewModelMutableLiveData.setValue(mMovieModel);
    }

//    TODO (5)
//    ابني الداله اللي بتجيب بيانات من الداتا بيز
    private MovieModel getMovieDetailsFromDB(){
        return new MovieModel(1,
                "The Prestige",
                "2006",
                "psychological thriller film directed" +
                        " by Christopher Nolan and written by" +
                        " Nolan and his brother Jonathan, based " +
                        "on the 1995 novel by Christopher Priest. " +
                        "It follows Robert Angier and Alfred Borden, " +
                        "rival stage magicians in London at the end of " +
                        "the 19th century");
    }
}
