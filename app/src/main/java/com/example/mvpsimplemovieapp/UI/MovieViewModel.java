package com.example.mvpsimplemovieapp.UI;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvpsimplemovieapp.Models.MovieModel;

import java.util.ArrayList;

//    TODO (3)
// هبني الفيو مودل بتاعي
public class MovieViewModel extends ViewModel {
//     TODO (4)
// هعرف اوبجكت من الداتا اللي ممكن اعدل عليها بايدي
    MutableLiveData<ArrayList<MovieModel>> mMovieViewModelMutableLiveData = new MutableLiveData<>();

    //        TODO (6)
//    ابني الداله اللي هتجيب الداتا من الداتابيز وتحطها جاهزه لاي فيو هيتسنط
    public void getMovieDetails(){
        mMovieViewModelMutableLiveData.setValue(getMovieListFromDB());
    }


    private ArrayList<MovieModel> getMovieListFromDB(){
        ArrayList<MovieModel> arrayList = new ArrayList<>();
        arrayList.add(new MovieModel(1,
                "The Prestige",
                "2006",
                "psychological thriller film directed" +

                        "rival stage magicians in London at the end of " +
                        "the 19th century"));
        arrayList.add(new MovieModel(2,
                "The Prestige",
                "2006",
                "psychological thriller film directed" +

                        "It follows Robert Angier and Alfred Borden, " +
                        "rival stage magicians in London at the end of " +
                        "the 19th century"));
        arrayList.add(new MovieModel(3,
                "The Prestige",
                "2006",
                "psychological thriller film directed" +
                        "It follows Robert Angier and Alfred Borden, " +
                        "rival stage magicians in London at the end of " +
                        "the 19th century"));
        arrayList.add(new MovieModel(4,
                "Cast Away",
                "2000",
                "psychological thriller film directed" +
                        " by Christond of " +
                        "the 19th century"));
        arrayList.add(new MovieModel(5,
                "Life of Pi",
                "2012",
                "dventure drama film[11] based on Yann Martel's 2001 novel of the same name. Directed by Ang Lee, the film's adapted screenplay was written by David Magee, and it stars Suraj Sharma, Irrfan Khan, Rafe Spall, Tabu, Adil Hussain, and Gérard  named \"Pi\" Patel, tellin the Pacific Ocean on a lifeboat with a Bengal tiger. The film had its worldwide premiere as the opening film of the 51st New York Film Festival at both the Walter Reade Theater and Alice Tully Hall in New York City on September 28, 2012.[12]"));
        arrayList.add(new MovieModel(6,
                "The Prestige",
                "2006",
                "psychological thriller film directed" +
                        " by Christopher Nolan and written by" +
                        "rival stage magicians in London at the end of " +
                        "the 19th century"));

        return arrayList;
    }
}
