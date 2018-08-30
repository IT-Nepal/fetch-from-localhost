package com.example.ubuntu.workingjquery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {

    String url = "http://192.168.1.161/webexample/select.php"; //localhost webservices
    AQuery aQuery;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv);
        aQuery = new AQuery(this);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            fetchData();
            }
        });
    }

    public void fetchData(){
    aQuery.ajax(url, JSONArray.class, new AjaxCallback<JSONArray>(){
        @Override
        public void callback(String url, JSONArray array, AjaxStatus status) {
            super.callback(url, array, status);

            Log.i("response", "response" + array

            );
        }
    });
    }
}
