package bagga.com.recyclerv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

import bagga.com.recyclerv.Adapters.RecycleAdapter;
import bagga.com.recyclerv.Model.Data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Data> data = new ArrayList<>();

        for (int i= 0; i<20;i++) {
            Data data1 = new Data(i);
            data.add(data1);
        }

        RecyclerView mMultiChoiceRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        RecycleAdapter recycleAdapter = new RecycleAdapter(data);
        mMultiChoiceRecyclerView.setLayoutManager(manager);
        mMultiChoiceRecyclerView.setAdapter(recycleAdapter);

    }
}
