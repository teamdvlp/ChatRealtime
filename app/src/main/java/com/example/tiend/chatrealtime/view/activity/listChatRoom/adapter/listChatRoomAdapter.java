package com.example.tiend.chatrealtime.view.activity.listChatRoom.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import com.example.tiend.chatrealtime.R;

/**
 * Created by tiend on 8/17/2017.
 */

public class listChatRoomAdapter extends RecyclerView.Adapter {
    private Context context;

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new viewholer(LayoutInflater.from(context).inflate(R.layout.rowlvroomchat, parent));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class viewholer extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtContent;

        public viewholer(View itemView) {
            super(itemView);
            txtContent = itemView.findViewById(R.id.txtContent);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
