package com.example.izual.losteden;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.izual.losteden.Fragment.Elf;
import com.example.izual.losteden.Fragment.Human;
import com.example.izual.losteden.Fragment.Khajiit;
import com.example.izual.losteden.Fragment.Ork;
import com.example.izual.losteden.Fragment.Undead;


public class NewGame extends FragmentActivity implements AdapterView.OnItemSelectedListener {
    private FragmentManager manager;
    private FragmentTransaction transaction;
    Spinner heroselect;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newgame);
        manager = getSupportFragmentManager();
        heroselect = (Spinner) findViewById(R.id.heroselect);
        ArrayAdapter<?> adapter =
                ArrayAdapter.createFromResource(this, R.array.heroselect, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        heroselect.setAdapter(adapter);
        heroselect.setOnItemSelectedListener(NewGame.this);


    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        transaction = manager.beginTransaction();

        switch (i) {
            case 0:
                Human human = new Human();
                transaction.replace(R.id.container, human);
                break;
            case 1:
                Undead undead = new Undead();
                transaction.replace(R.id.container, undead);
                break;
            case 2:
                Elf elf = new Elf();
                transaction.replace(R.id.container, elf);
                break;
            case 3:
                Khajiit khajiit = new Khajiit();
                transaction.replace(R.id.container, khajiit);
                break;
            case 4:
                Ork ork = new Ork();
                transaction.replace(R.id.container, ork);
                break;
        }
        transaction.commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

}



