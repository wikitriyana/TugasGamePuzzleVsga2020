package com.example.tugasvsga2020gamepuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.widget.GridLayout;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 //  private Button btna,btnb,btnc,btnd,btne,btnf,btng,btnh,btni,btnj,btnk,btnl,btnm,btnn,btno,btnmove;
    final  String [] dataPuzzle = new String[]{"A", "B", "C", "D", "E","F", "G", "H", "I", "j", "K", "L", "M", "N","O", ""};
    int [] btnId = {R.id.btna, R.id.btnb, R.id.btnc, R.id.btnd, R.id.btne, R.id.btnf, R.id.btng, R.id.btnh, R.id.btni, R.id.btnj, R.id.btnk, R.id.btnl, R.id.btnm, R.id.btnn, R.id.btno, R.id.btnMove};
    Button [] buttons;
    boolean show_dialog_success = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRandom();
    }

    protected void onPause(){
        super.onPause();
    }

    private void setLetterToButton(){
        buttons = new Button[16];
        for (int i=0; i<dataPuzzle.length; i++){
            buttons[i] = findViewById(btnId[i]);
            buttons[i].setText(dataPuzzle[i]);
            buttons[i].setOnClickListener(this);
        }
    }

    private void cekSukses(){
        boolean btn1 = buttons[0].getText().toString().equals("A");
        boolean btn2 = buttons[1].getText().toString().equals("B");
        boolean btn3 = buttons[2].getText().toString().equals("C");
        boolean btn4 = buttons[3].getText().toString().equals("D");
        boolean btn5 = buttons[4].getText().toString().equals("E");
        boolean btn6 = buttons[5].getText().toString().equals("F");
        boolean btn7 = buttons[6].getText().toString().equals("G");
        boolean btn8 = buttons[7].getText().toString().equals("H");
        boolean btn9 = buttons[8].getText().toString().equals("I");
        boolean btn10 = buttons[9].getText().toString().equals("J");
        boolean btn11 = buttons[10].getText().toString().equals("K");
        boolean btn12 = buttons[11].getText().toString().equals("L");
        boolean btn13 = buttons[12].getText().toString().equals("M");
        boolean btn14 = buttons[13].getText().toString().equals("N");
        boolean btn15 = buttons[14].getText().toString().equals("O");
        boolean btn16 = buttons[15].getText().toString().equals("");

        if (btn1 && btn2 && btn3 && btn4 && btn5 && btn6 && btn7 && btn8 && btn9 && btn10 && btn11 && btn12 && btn13 && btn14 && btn15 && btn16){
            cekSukses();
            }

        }

    public void onClick(View view) {

        for (int i=0; i<dataPuzzle.length; i++) {
            if (view.getId() == btnId[i]){
                String get_btn_letter = buttons[i].getText().toString();
                //A
                if (i == 0){
                    if (buttons[i+1].getText().toString().equals("")){
                        buttons[i+1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i+4].getText().toString().equals("")){
                        buttons[i+4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //B, C
                if (i == 1 || i == 2){
                    if (buttons[i+1].getText().toString().equals("")){
                        buttons[i+1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i+4].getText().toString().equals("")){
                        buttons[i+4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-1].getText().toString().equals("")){
                        buttons[i-1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //D
                if (i == 3){
                    if (buttons[i-1].getText().toString().equals("")){
                        buttons[i-1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i+4].getText().toString().equals("")){
                        buttons[i+4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //E, I
                if (i == 4 || i == 8){
                    if (buttons[i+1].getText().toString().equals("")){
                        buttons[i+1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i+4].getText().toString().equals("")){
                        buttons[i+4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-4].getText().toString().equals("")){
                        buttons[i-4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //F, G, J, K
                if (i == 5 || i == 6 || i == 9 || i == 10){
                    if (buttons[i+1].getText().toString().equals("")){
                        buttons[i+1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i+4].getText().toString().equals("")){
                        buttons[i+4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-1].getText().toString().equals("")){
                        buttons[i-1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-4].getText().toString().equals("")){
                        buttons[i-4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //H, L
                if (i == 7 || i ==11){
                    if (buttons[i-1].getText().toString().equals("")){
                        buttons[i-1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i+4].getText().toString().equals("")){
                        buttons[i+4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-4].getText().toString().equals("")){
                        buttons[i-4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //M
                if (i == 12){
                    if (buttons[i+1].getText().toString().equals("")){
                        buttons[i+1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-4].getText().toString().equals("")){
                        buttons[i-4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }
                //N, O
                if (i ==13 || i == 14){
                    if (buttons[i+1].getText().toString().equals("")){
                        buttons[i+1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-1].getText().toString().equals("")){
                        buttons[i-1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-4].getText().toString().equals("")){
                        buttons[i-4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                }

                if (i == 15){
                    if (buttons[i-1].getText().toString().equals("")){
                        buttons[i-1].setText(get_btn_letter);
                        buttons[i].setText("");
                    }else if(buttons[i-4].getText().toString().equals("")){
                        buttons[i-4].setText(get_btn_letter);
                        buttons[i].setText("");
                    }
                    cekSukses();
                }

            }
        }

    }
    public void btn_exit(View view) {
                finish();
    }
    public void btnreset(View v) {
        setRandom();
        show_dialog_success = true;
    }


    private void setRandom() {
        final String[] letterPazzel = dataPuzzle;
        shuffle(letterPazzel);
        for (int i=0; i<dataPuzzle.length; i++){
            dataPuzzle[i] = letterPazzel[i];
        }
        setLetterToButton();
    }

    public static void shuffle(Object[] array){
        int noOfElement = array.length;
        for (int i=0; i<noOfElement; i++){
            int s = i + (int) ( Math.random() * (noOfElement - i) );

            Object temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }

    //@Override
   // public void onPointerCaptureChanged(boolean hasCapture) {

   // }
}