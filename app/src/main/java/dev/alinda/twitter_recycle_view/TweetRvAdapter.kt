package dev.alinda.twitter_recycle_view

import android.media.ImageReader
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter (var tweetlist: List<Tweets> ):RecyclerView.Adapter<TweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetViewHolder {
       var itemView=LayoutInflater.from(parent.context)
           .inflate(R.layout.tweet_list_name,parent,false)
        return TweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetViewHolder, position: Int) {
        var currentTweet= tweetlist.get(position)
        holder.tvtweet.text=currentTweet.tweet
        holder.tvtweetname.text=currentTweet.tweetname
        holder.tvnum.text=currentTweet.num
        holder.tvparagraph.text=currentTweet.paragraph
        holder.tvrepliescount.text=currentTweet.repliescount
        holder.tvretweet.text=currentTweet.retweet
        holder.tvLikesnumber.text=currentTweet.likesnumber


    }

    override fun getItemCount(): Int {
      return tweetlist.size

    }
}
class TweetViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var imgAvatar=itemView.findViewById<ImageView>(R.id.imgAvatar)
    var tvtweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvtweetname=itemView.findViewById<TextView>(R.id.tvTweetname)
    var tvnum=itemView.findViewById<TextView>(R.id.tvnum)
    var imgLoader=itemView.findViewById<ImageView>(R.id.imgLoading)
    var tvparagraph=itemView.findViewById<TextView>(R.id.tvparagraph)
    var imgchat=itemView.findViewById<ImageView>(R.id.imgChat)
    var tvrepliescount=itemView.findViewById<TextView>(R.id.tvRepliescount)
    var imgretweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var tvretweet=itemView.findViewById<TextView>(R.id.tvRetweet)
    var imglikes=itemView.findViewById<ImageView>(R.id.imgLikes)
    var tvLikesnumber=itemView.findViewById<TextView>(R.id.tvLikesnumber)
    var imageshare=itemView.findViewById<ImageView>(R.id.imgShare)

}