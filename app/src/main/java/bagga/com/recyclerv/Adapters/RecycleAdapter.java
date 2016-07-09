package bagga.com.recyclerv.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.davidecirillo.multichoicerecyclerview.MultiChoiceAdapter;

import java.util.ArrayList;

import bagga.com.recyclerv.Model.Data;
import bagga.com.recyclerv.R;
import bagga.com.recyclerv.ViewHolders.RecyclerViewHolder;

/**
 * Created by Davin12x on 16-07-08.
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecyclerViewHolder>  {

    ArrayList<Data> arrayList;
    public RecycleAdapter(ArrayList<Data> integers) {
        this.arrayList = integers;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_content,parent,false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
      //  super.onBindViewHolder(holder, position);
        Data data = arrayList.get(position);
        holder.updateUI(data);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
