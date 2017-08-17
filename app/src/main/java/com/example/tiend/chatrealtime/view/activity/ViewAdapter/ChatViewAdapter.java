package com.example.tiend.chatrealtime.view.activity.ViewAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tiend.chatrealtime.R;
import com.example.tiend.chatrealtime.model.Message;
import com.example.tiend.chatrealtime.model.User;

import java.util.ArrayList;

/**
 * Created by phamf on 17-Aug-17.
 */

public class ChatViewAdapter extends RecyclerView.Adapter<ChatViewAdapter.DataViewHolder> {
    private static final int MY_MESSAGE = 1;
    private static final int THEIR_MESSAGE = 0;

    Context context;
    ArrayList<Message> list;
    User user;

    public ChatViewAdapter(Context context, ArrayList<Message> list, User user) {
        this.context = context;
        this.list = list;
        this.user = user;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;

        if (viewType == MY_MESSAGE) {
            view = LayoutInflater.from(context).inflate(R.layout.my_chat_bar, parent,false);
        } else if (viewType == THEIR_MESSAGE) {
            view = LayoutInflater.from(context).inflate(R.layout.their_chat_bar , parent,false);
        }

        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder holder, int position) {
        holder.txt_content.setText(list.get(position).getContent());
        holder.txt_time.setText("" + list.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position).getSender().equals(user.getName())){

            return MY_MESSAGE;
        }
        return THEIR_MESSAGE;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView txt_content, txt_time;
        public DataViewHolder(View itemView) {
            super(itemView);
            txt_content = itemView.findViewById(R.id.txt_message);
            txt_time = itemView.findViewById(R.id.txt_chatTime);
        }
    }
}
