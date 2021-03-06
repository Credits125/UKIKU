package knf.kuma.tv.anime

import android.view.ViewGroup

import androidx.leanback.widget.Presenter
import knf.kuma.pojos.AnimeObject
import knf.kuma.tv.cards.ChapterCardView

class ChapterPresenter : Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup): Presenter.ViewHolder {
        return Presenter.ViewHolder(ChapterCardView(parent.context))
    }

    override fun onBindViewHolder(viewHolder: Presenter.ViewHolder, item: Any) {
        (viewHolder.view as ChapterCardView).bind(item as AnimeObject.WebInfo.AnimeChapter)
    }

    override fun onUnbindViewHolder(viewHolder: Presenter.ViewHolder) {

    }
}
