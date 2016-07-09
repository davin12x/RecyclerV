package bagga.com.recyclerv.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import bagga.com.recyclerv.Model.Data;
import bagga.com.recyclerv.R;

/**
 * Created by Davin12x on 16-07-08.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView)itemView.findViewById(R.id.contents);
    }

    public void updateUI(Data data) {

        String result = String.valueOf(data.getContent());
        mTextView.setText(result);
    }
}
