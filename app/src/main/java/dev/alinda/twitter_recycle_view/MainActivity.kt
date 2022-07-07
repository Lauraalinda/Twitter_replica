package dev.alinda.twitter_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.alinda.twitter_recycle_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }

    fun displayTweets() {
        var tweet = Tweets("Sarah_Alinda", "@beautiful", ".10h", "Let us just have a holiday\n" + "which country are we going\n"+ "to this time", "1,234", "1k", "25k")
        var tweet1 = Tweets("John", "@Tibenda", ".40h", "I raised a million dollars today\n"+"I won the lottery but honestly\n" + "I can't believe it","1k", "1900k", "40k")
        var tweet2 = Tweets("Alinda_linda", "@kenyana", ".30h", "I got a jo at Microsoft today\n"+"Cheers to small wins", "4,600", "4k", "21k")
        var tweet3 = Tweets("Joel_Louis", "@joel", ".30h", "We have a trip to Abudhabi", "124", "9k", "40k")
        var tweet4 = Tweets("Kake_Abigail", "@kushkins", ".10h", "God is such a wonderful God", "1,923", "60k", "21k")
        var tweetsList = listOf(tweet, tweet1, tweet2, tweet3,tweet4)
        var tweetsAdapter= TweetRvAdapter(tweetsList)
        binding.rvtweet.layoutManager=LinearLayoutManager(this)
        binding.rvtweet.adapter=tweetsAdapter
    }
}