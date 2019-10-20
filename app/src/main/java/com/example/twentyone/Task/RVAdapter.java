package com.example.twentyone.Task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.twentyone.R;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Task_itemViewHolder> {

    public static class Task_itemViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView tvDescTask;
        TextView tvCoinCount;
        ImageView idLogo;
        ImageView idCoin;

        Task_itemViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            tvDescTask = (TextView)itemView.findViewById(R.id.textTask);
            tvCoinCount = (TextView)itemView.findViewById(R.id.coinCount);
            idLogo = (ImageView) itemView.findViewById(R.id.idLogoTask);
            idCoin = (ImageView) itemView.findViewById(R.id.logoCoinCount);
        }
    }

    List<TaskItem> newsList;

    public RVAdapter(List<TaskItem> newsList){
        this.newsList = newsList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public Task_itemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.task_item, viewGroup, false);
        Task_itemViewHolder pvh = new Task_itemViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(Task_itemViewHolder personViewHolder, int i) {
        personViewHolder.tvDescTask.setText(newsList.get(i).descTask);
        personViewHolder.tvCoinCount.setText(newsList.get(i).coinCOunt);
        personViewHolder.idLogo.setImageResource(newsList.get(i).idLogo);
        personViewHolder.idCoin.setImageResource(newsList.get(i).idCoinLogo);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}