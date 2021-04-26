package com.example.recyclerviewhttprequests.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.recyclerviewhttprequests.R;
import com.example.recyclerviewhttprequests.interfaces.OnAlbumItemClick;
import com.example.recyclerviewhttprequests.interfaces.OnUserItemClick;
import com.example.recyclerviewhttprequests.models.Album;
import com.example.recyclerviewhttprequests.models.Post;
import com.example.recyclerviewhttprequests.models.User;
import com.example.recyclerviewhttprequests.viewholders.AlbumViewHolder;
import com.example.recyclerviewhttprequests.viewholders.ImageViewHolder;
import com.example.recyclerviewhttprequests.viewholders.PostViewHolder;
import com.example.recyclerviewhttprequests.viewholders.UserViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private Context context;
    ArrayList<User> users;
    public static OnUserItemClick onUserItemClick;

    public UserAdapter(ArrayList<User> users, OnUserItemClick onUserItemClick) {
        this.users = users;
        this.onUserItemClick = onUserItemClick;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.user_cell, parent, false);
        UserViewHolder userViewHolder = new UserViewHolder(view);

        return userViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);

        holder.bind(user);
    }

    @Override
    public int getItemCount() {
        return this.users.size();
    }

}

