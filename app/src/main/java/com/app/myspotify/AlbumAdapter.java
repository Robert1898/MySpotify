package com.app.myspotify;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {


    private ArrayList<AlbumModel> albumModelArrayList;
    private Context context;

    public AlbumAdapter(ArrayList<AlbumModel> albumModelArrayList, Context context) {
        this.albumModelArrayList = albumModelArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumAdapter.ViewHolder holder, int position) {

        AlbumModel albumModel = albumModelArrayList.get(position);
        Picasso.get().load(albumModel.getImageURL()).into(holder.albumImageView);
        holder.albumName.setText(albumModel.getName());
        holder.albumDetails.setText(albumModel.getArtistName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, AlbumDetailActivity.class);
                intent.putExtra("id",albumModel.getId());
                intent.putExtra("name",albumModel.getName());
                intent.putExtra("img",albumModel.getImageURL());
                intent.putExtra("artist",albumModel.getArtistName());
                intent.putExtra("albumURl",albumModel.getExternal_urls());
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return albumModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView albumImageView;
        private TextView albumName,albumDetails;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            albumImageView = itemView.findViewById(R.id.idAlbumImage);
            albumName = itemView.findViewById(R.id.idAlbumName);
            albumDetails = itemView.findViewById(R.id.idTVALbumDetails);

        }
    }
}
