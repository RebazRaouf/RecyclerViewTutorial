package kdev.kurdishnews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewsData data = new NewsData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        NewsAdapter adapter = new NewsAdapter(this, data.getNewsData(), this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClicked(int id, String title) {
        Toast.makeText(getApplicationContext(), "Item ID:"+ id+
                "\nTitle:" + title,Toast.LENGTH_LONG).show();
    }
}
