package knf.kuma.tv.anime

import android.view.ViewGroup
import androidx.leanback.widget.Presenter
import knf.kuma.tv.cards.AnimeCardView
import knf.kuma.tv.search.BasicAnimeObject

class AnimePresenter : Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup): Presenter.ViewHolder {
        return Presenter.ViewHolder(AnimeCardView(parent.context))
    }

    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder, item: Any) {
        (viewHolder.view as AnimeCardView).bind(item as BasicAnimeObject)
    }

    override fun onUnbindViewHolder(viewHolder: Presenter.ViewHolder) {

    }
}
