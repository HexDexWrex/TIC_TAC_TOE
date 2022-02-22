package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    int board[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    int Players = 0;
    boolean Active = true;



    int[][] WinPositions = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
            {0, 4, 8}, {2, 4, 6}
    };

    public void placeAMarker(View view) {
        ImageView iv = (ImageView) view;
        int tappeddiv = Integer.parseInt(iv.getTag().toString());

        if (board[tappeddiv] == 2 && Active) {
            board[tappeddiv] = Players;

            if (Players == 0) {

                iv.setImageResource(R.drawable.c);
                Players = 1;
            } else {
                iv.setImageResource(R.drawable.o);
                Players = 0;
            }

            iv.setTranslationY(1000);
            iv.animate()
                    .translationXBy(-1000)
                    .rotationBy(3600)
                    .setDuration(2000);

//            for (int[] winPositions : WinPositions) {
//
//            }


        }

    }
}
