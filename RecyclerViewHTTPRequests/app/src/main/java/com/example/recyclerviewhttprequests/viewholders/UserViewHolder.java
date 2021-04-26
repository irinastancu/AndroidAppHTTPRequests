package com.example.recyclerviewhttprequests.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewhttprequests.R;
import com.example.recyclerviewhttprequests.adapters.AlbumAdapter;
import com.example.recyclerviewhttprequests.adapters.UserAdapter;
import com.example.recyclerviewhttprequests.fragments.F1;
import com.example.recyclerviewhttprequests.fragments.F2;
import com.example.recyclerviewhttprequests.models.Album;
import com.example.recyclerviewhttprequests.models.User;

public class UserViewHolder extends RecyclerView.ViewHolder {
    private TextView title;

    public UserViewHolder(@NonNull View view) {
        super(view);
        title = view.findViewById(R.id.user_name);

    }

    public void bind(User user) {

        title.setText(user.getTitle());

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                F1.userNameClicked = user.getTitle();
                if (UserAdapter.onUserItemClick != null)
                    UserAdapter.onUserItemClick.onClick(user);
            }
        });
    }

}
