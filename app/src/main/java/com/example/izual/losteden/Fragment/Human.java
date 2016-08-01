package com.example.izual.losteden.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.izual.losteden.CreateHero;
import com.example.izual.losteden.R;

public class Human extends Fragment implements View.OnClickListener {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.zhuman, null);

    }

    public void onStart() {
        super.onStart();
        final ImageButton imageButton1 = (ImageButton) getActivity().findViewById(R.id.imageButton8);
        final ImageButton imageButton2 = (ImageButton) getActivity().findViewById(R.id.imageButton9);
        final ImageButton imageButton3 = (ImageButton) getActivity().findViewById(R.id.imageButton10);
        final ImageButton imageButton4 = (ImageButton) getActivity().findViewById(R.id.imageButton11);
        final ImageButton imageButton5 = (ImageButton) getActivity().findViewById(R.id.imageButton12);
        final ImageButton imageButton6 = (ImageButton) getActivity().findViewById(R.id.imageButton13);
        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        final Intent intent = new Intent(getContext(), CreateHero.class);
        intent.putExtra("Race", "Human");
        switch (v.getId()) {
            case R.id.imageButton8:
                intent.putExtra("image", R.drawable.h1);
                getActivity().startActivity(intent);
                break;
            case R.id.imageButton9:
                intent.putExtra("image", R.drawable.h2);
                getActivity().startActivity(intent);
                break;
            case R.id.imageButton10:
                intent.putExtra("image", R.drawable.h3);
                getActivity().startActivity(intent);
                break;
            case R.id.imageButton11:
                intent.putExtra("image", R.drawable.h4);
                getActivity().startActivity(intent);
                break;
            case R.id.imageButton12:
                intent.putExtra("image", R.drawable.h5);
                getActivity().startActivity(intent);
                break;
            case R.id.imageButton13:
                intent.putExtra("image", R.drawable.h6);
                getActivity().startActivity(intent);
                break;


        }


    }
}




