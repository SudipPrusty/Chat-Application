package com.example.chatapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MessageAdapter extends RecyclerView.Adapter {

    Context context;
    ArrayList<msgModelclass> messageAdpaterArrayList;
    int ITEM_SEND=1;
    int ITEM_RECEIVE=2;

    public MessageAdapter(chatwindow chatwindow, ArrayList<msgModelclass> messagesArrayList) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == ITEM_SEND) {
            View view = LayoutInflater.from(context).inflate(R.layout.sender_layout, parent, false);
            return new senderViewHolder(view);
        }
        else{
            View view = LayoutInflater.from(context).inflate(R.layout.receiver_layout,parent, false);
            return new receiverviewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {
        msgModelclass messages = messageAdpaterArrayList.get(position);
        if(holder.getClass()==senderViewHolder.class)
        {
            senderViewHolder viewholder = (senderViewHolder) holder;
            viewholder.msgtxt.setText(messages.getMesssage());

        }
        else{
            receiverviewHolder viewHolder = (receiverviewHolder) holder;
            viewHolder.msgtxt.setText(messages.getMesssage());
        }
    }

    @Override
    public int getItemCount() {

        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        msgModelclass messages = messageAdpaterArrayList.get(position);
        if(FirebaseAuth.getInstance().getCurrentUser().getUid().equals(messages.getSenderid())){
            return ITEM_SEND;
        }
        else {
            return ITEM_RECEIVE;
        }
    }

    class senderViewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView msgtxt;
        public senderViewHolder(@NonNull View itemView) {

            super(itemView);
            circleImageView = itemView.findViewById(R.id.profilerggg);
            msgtxt = itemView.findViewById(R.id.msgsendertyp);
        }
    }

    class receiverviewHolder extends RecyclerView.ViewHolder {
        CircleImageView circleImageView;
        TextView msgtxt;
        public receiverviewHolder(@NonNull View itemView) {

            super(itemView);
            circleImageView = itemView.findViewById(R.id.pro);
            msgtxt = itemView.findViewById(R.id.recivertextset);
        }
    }


}
