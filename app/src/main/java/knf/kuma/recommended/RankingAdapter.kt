package knf.kuma.recommended

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import knf.kuma.R
import knf.kuma.database.CacheDB
import kotlinx.android.synthetic.main.item_ranking.view.*

class RankingAdapter : RecyclerView.Adapter<RankingAdapter.RankHolder>() {

    private val list = CacheDB.INSTANCE.genresDAO().ranking
    private var total = 0

    init {
        for (statusObject in list)
            total += statusObject.count
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RankHolder {
        return RankHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_ranking, parent, false))
    }

    override fun onBindViewHolder(holder: RankHolder, position: Int) {
        val statusObject = list[position]
        holder.title.text = statusObject.name
        holder.count.text = statusObject.count.toString()
        holder.ranking.max = total
        holder.ranking.progress = statusObject.count
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class RankHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.title
        val count: TextView = itemView.count
        val ranking: ProgressBar = itemView.ranking
    }
}