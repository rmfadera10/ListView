package com.letstravel.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {
    private TextView txtview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);

        txtview2=(TextView)findViewById(R.id.txtview2);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String capi=bundle.getString("Capital");
            txtview2.setText(capi);
        }else {
            Toast.makeText(this, "No Capital", Toast.LENGTH_SHORT).show();
        }
    }
}
