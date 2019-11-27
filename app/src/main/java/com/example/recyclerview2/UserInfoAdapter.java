package com.example.recyclerview2;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserInfoAdapter extends RecyclerView.Adapter<UserInfoAdapter.UserInfoViewHolder> {

    Context mContext;
    List<UserInfo> userInfoList;


    public UserInfoAdapter(Context mContext, List<UserInfo> userInfoList){
        this.mContext = mContext;
        this.userInfoList = userInfoList;
    }

    @NonNull
    @Override
    public UserInfoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_users,parent,false);
        return new UserInfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserInfoViewHolder holder, int position) {
        UserInfo userInfo = userInfoList.get(position);
        holder.imgProfile.setImageResource(userInfo.getImageId());
        holder.tvName.setText(userInfo.getName());
        holder.tvAge.setText(userInfo.getAge());
        holder.tvLocation.setText(userInfo.getLocation());
        holder.tvGender.setText(userInfo.getGender());
    }

    @Override
    public int getItemCount() {
        return userInfoList.size();
    }

    public class UserInfoViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvName, tvAge, tvLocation, tvGender;
        public UserInfoViewHolder(@NonNull View  itemView){

            super(itemView);
            imgProfile = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
            tvAge = itemView.findViewById(R.id.textView2);
            tvLocation = itemView.findViewById(R.id.textView3);
            tvGender = itemView.findViewById(R.id.textView4);
        }
    }

}
