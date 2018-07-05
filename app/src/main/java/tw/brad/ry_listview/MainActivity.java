package tw.brad.ry_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.HashMap;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        initListView();

    }

    private void initListView(){
        String[] from = {};
        int[] to = {};
        LinkedList<HashMap<String,String>> data = new LinkedList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, data,R.layout.item,from,to);
        listView.setAdapter(adapter);

    }

    public void add(View view) {
    }
    public void del(View view) {
    }
}
