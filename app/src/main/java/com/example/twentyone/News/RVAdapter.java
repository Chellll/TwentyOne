package com.example.twentyone.News;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twentyone.Model.News;
import com.example.twentyone.R;

import org.w3c.dom.Text;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.News_itemViewHolder> {

    public static class News_itemViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView tvNameTheme;
        TextView tvNameUser;
        TextView tvCreatedDate;
        TextView tvDescription;
        ImageView idLogo;
        ImageView idDesc;

        News_itemViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            tvNameTheme = (TextView)itemView.findViewById(R.id.theme_name_text_view);
            tvNameUser = (TextView)itemView.findViewById(R.id.author_nick_text_view);
            tvCreatedDate = (TextView) itemView.findViewById(R.id.creation_date_text_view);
            tvDescription = (TextView) itemView.findViewById(R.id.desc_text_view);
            idLogo = (ImageView) itemView.findViewById(R.id.profile_image_view);
            idDesc = (ImageView) itemView.findViewById(R.id.desc_image_view);
        }
    }

    List<News_item> newsList;

    public RVAdapter(List<News_item> newsList){
        this.newsList = newsList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public News_itemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.news_item_view, viewGroup, false);
        News_itemViewHolder pvh = new News_itemViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(News_itemViewHolder personViewHolder, int i) {
        personViewHolder.tvNameTheme.setText(newsList.get(i).nameTheme);
        personViewHolder.tvNameUser.setText(newsList.get(i).nickUser);
        personViewHolder.tvCreatedDate.setText(newsList.get(i).createdDate);
        personViewHolder.tvDescription.setText(newsList.get(i).description);
        personViewHolder.idLogo.setImageResource(newsList.get(i).idLogo);
        personViewHolder.idDesc.setImageResource(newsList.get(i).idDescr);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}