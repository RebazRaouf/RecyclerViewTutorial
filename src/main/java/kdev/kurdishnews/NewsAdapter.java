package kdev.kurdishnews;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by reba on 2/27/18.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ItemHolder> {


    private Activity activity;
    private ArrayList<NewsModel> newsModels;
    private ClickListener listener;


    public NewsAdapter(Activity activity, ArrayList<NewsModel> newsModels, ClickListener listener){
        this.activity = activity;
        this.newsModels = newsModels;
        this.listener = listener;
    }


    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View customView = LayoutInflater.from(activity).inflate(R.layout.news_cell, null);
        return new ItemHolder(customView);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        NewsModel model = newsModels.get(position);
        holder.title.setText(model.getTitle());
        holder.shortDetail.setText(model.getShortDetail());
        holder.image.setImageResource(model.getResourceId());
    }

    @Override
    public int getItemCount() {
        return newsModels.size();
    }

    class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image;
        TextView title, shortDetail;

        public ItemHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.title);
            shortDetail = itemView.findViewById(R.id.short_detail);

            image.setOnClickListener(this);
            title.setOnClickListener(this);
            shortDetail.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            int selectedPosition = getAdapterPosition();

            if(selectedPosition == RecyclerView.NO_POSITION){
                return;
            }

            if(listener != null){
                NewsModel model = newsModels.get(selectedPosition);
                listener.onItemClicked(model.getId(), model.getTitle());
            }

        }
    }

}
