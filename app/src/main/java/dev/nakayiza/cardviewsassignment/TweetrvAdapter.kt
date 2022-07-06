package dev.nakayiza.cardviewsassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetrvAdapter (var tweetlist:List<Tweet>):
        RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.tweets_item,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currenttweet=tweetlist.get(position)
        holder.tvname.text=currenttweet.displayname
        holder.tvhandle.text=currenttweet.handle
        holder.tvtweet.text=currenttweet.tweet
    }

    override fun getItemCount(): Int {
        return tweetlist.size
    }

}
class TweetViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvhandle=itemView.findViewById<TextView>(R.id.tvhandle)
    var tvtweet=itemView.findViewById<TextView>(R.id.tvtweet)
    var imperson=itemView.findViewById<ImageView>(R.id.imperson)
    var imcomment=itemView.findViewById<ImageView>(R.id.imcomment)
    var imretweet=itemView.findViewById<ImageView>(R.id.imretweet)
    var imlike=itemView.findViewById<ImageView>(R.id.imlike)
    var imshare=itemView.findViewById<ImageView>(R.id.imshare)
}