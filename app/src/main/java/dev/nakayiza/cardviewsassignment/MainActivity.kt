package dev.nakayiza.cardviewsassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.nakayiza.cardviewsassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytweets()
    }
    fun displaytweets(){
        var tweet=Tweet("Nakayiza","juliemids","i am the blackpearl princess of rap","9m","2m","7b")
        var tweet1=Tweet("nicki","the barbie","i am the queen of rap in the world","1.6m","556","1.0m")
        var tweet2=Tweet("rena","african queen","the black pearl african queen","1m","5m","1b")
        var tweet3=Tweet("irene","realmids","find me in hiphop","1k","1m","2.6m")
        var tweet4=Tweet("Nakayiza","juliemids","i am the princess of rap in the world","567","556","1.0m")
        var tweet5=Tweet("Nakayiza","juliemids","i am the princess of rap in the world","567","556","1.0m")
        var tweet6=Tweet("Nakayiza","juliemids","i am the princess of rap in the world","567","556","1.0m")
        var tweet7=Tweet("Nakayiza","juliemids","i am the princess of rap in the world","567","556","1.0m")

        var tweetlist= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7)
        var tweetsAdapter=TweetrvAdapter(tweetlist)
        binding.rvtweets.layoutManager=LinearLayoutManager(this)
        binding.rvtweets.adapter=tweetsAdapter

    }

}