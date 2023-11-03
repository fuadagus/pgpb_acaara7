package com.example.pgpbacara7;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import com.example.pgpbacara7.databinding.DestinationBinding;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.ItemDestinationViewHolder> {
    private List<Destination>destinationList;
    public  DestinationAdapter(List<Destination> list){
        destinationList = list;
    }

    @NonNull
    @Override
    public ItemDestinationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DestinationBinding binding = DestinationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemDestinationViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemDestinationViewHolder holder, int position){
        holder.bind(destinationList.get(position));

    }

    @Override
    public int getItemCount(){
        return destinationList.size();
    }

    public class  ItemDestinationViewHolder extends RecyclerView.ViewHolder{
        private DestinationBinding binding;
        public ItemDestinationViewHolder(DestinationBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind (Destination data){
           binding.destinationName.setText(data.getDestinationName());
           binding.ticketClass.setText(data.getTicketClass());
        }
    }
}
