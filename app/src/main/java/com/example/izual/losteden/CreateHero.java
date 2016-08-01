package com.example.izual.losteden;


import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.izual.losteden.Db.DatabaseHelper;

public class CreateHero extends AppCompatActivity {
    public DatabaseHelper mDatabaseHelper;
    public SQLiteDatabase mSqLiteDatabase;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createhero);


        //создание лаялки
        ImageView avatar = (ImageView) findViewById(R.id.avatar);
        TextView race = (TextView) findViewById(R.id.race);
       final int img = getIntent().getIntExtra("image", 0);
        avatar.setImageResource(img);
        final String raceint = getIntent().getStringExtra("Race");
        race.setText(raceint);
        //Херачу
        ImageButton mage = (ImageButton) findViewById(R.id.mageclass);
        final TextView classtxt = (TextView) findViewById(R.id.classtxt);
        mage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            classtxt.setText("Mage");
            }
        });
        //Name
        EditText name = (EditText) findViewById(R.id.editText);
        final String username = name.getText().toString();
        //bd
        ImageButton next = (ImageButton) findViewById(R.id.nextcreate);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDatabaseHelper = new DatabaseHelper(getApplicationContext(), "mydatabase.db", null, 1);
                SQLiteDatabase sdb;
                sdb = mDatabaseHelper.getReadableDatabase();
                ContentValues values = new ContentValues();
                values.put(DatabaseHelper.NAME_COLUMN, username );
                values.put(DatabaseHelper.RACE_COLUMN, raceint );
                values.put(DatabaseHelper.AVATAR_COLUMN, "213" );
                values.put(DatabaseHelper.CLASS_COLUMN, "233" );
                mSqLiteDatabase.insert("user", null, values);
             // Intent intent = new Intent(CreateHero.this, Game.class);
             // startActivity(intent);
            }
        });

    }
}