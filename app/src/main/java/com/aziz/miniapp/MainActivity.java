package com.aziz.miniapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button add_button;

    private com.riyad_patwary.recyclerviewpractise.MyAdapter mAdapter;
    private List<String> strings;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText1);
        editText=findViewById(R.id.editText);



        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //null point exception check
                if (strings == null) {
                    strings = new ArrayList<>();
                }

                String str = editText.getText().toString().trim();
                strings.add(str);

                mAdapter = new com.riyad_patwary.recyclerviewpractise.MyAdapter(MainActivity.this, strings);
                //which adapter will be used
                recyclerView.setAdapter(mAdapter);
                //which layout will be used
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                //mAdapter.notifyDataSetChanged();

                //to clear editText field
                editText.setText("");
                //short toast maker
                Toast.makeText(MainActivity.this, "Item saved", Toast.LENGTH_SHORT).show();


            }
        });

    }
}
