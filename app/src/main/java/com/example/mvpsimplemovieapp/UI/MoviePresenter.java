package com.example.mvpsimplemovieapp.UI;

import com.example.mvpsimplemovieapp.Models.MovieModel;

public class MoviePresenter {
//     TODO (4)
//    اعمل تهيئه بانك تعرف الانترفيس وتبني انستراكور يستقبله
    MovieInterface mMovieInterface;

    public MoviePresenter(MovieInterface mMovieInterface) {
        this.mMovieInterface = mMovieInterface;
    }

//    TODO (5)
//    ابني الداله اللي تجيب الداتا من المودل
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

//        TODO (6)
//    ابني الداله اللي هتبرط الداتا اللي جايه من المودل بالانترفيس
//    والل هتستدعيها في الفيو
    public void getMovieDetails(){
        String mName = getMovieDetailsFromDB().getmMoviewName();
        String mDate = getMovieDetailsFromDB().getmMoviewDate();
        String mDescription = getMovieDetailsFromDB().getmMoviewDescription();
        mMovieInterface.onGetMovieDetails(mName,
                mDate,
                mDescription);
    }

}
