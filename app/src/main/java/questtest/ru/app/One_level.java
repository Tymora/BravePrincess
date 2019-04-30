package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.os.AsyncTask;
import android.os.SystemClock;



public class One_level extends AppCompatActivity {

    OneTable oneTable = new OneTable();
    Delay delay = new Delay();
    public Animation a;
    public  TextView textView1;
    public  TextView textView2;
    public  TextView textView3;
    public  TextView textView4;
    public  TextView textView5;
    public  TextView textView6;
    public  TextView textView7;
    public  TextView textView8;
    public  TextView textView9;
    public  TextView textView10;
    public  TextView textView11l;
    public  Button one_button_next_level;

    public int line=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_level);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final TextView textView6 = (TextView) findViewById(R.id.textView6);
        final TextView textView7 = (TextView) findViewById(R.id.textView7);
        final TextView textView8 = (TextView) findViewById(R.id.textView8);
        final TextView textView9 = (TextView) findViewById(R.id.textView9);
        final TextView textView10 = (TextView) findViewById(R.id.textView10);
        final TextView textView11 = (TextView) findViewById(R.id.textView11);
        final Button one_button_next_level = (Button)findViewById(R.id.one_button_next_level);


        textView1.setText(oneTable.onescenario[0]);
        textView2.setText(oneTable.onescenario[1]);
        textView3.setText(oneTable.onescenario[2]);
        textView4.setText(oneTable.onescenario[3]);
        textView5.setText(oneTable.onescenario[4]);
        textView6.setText(oneTable.onescenario[5]);
        textView7.setText(oneTable.onescenario[6]);
        textView8.setText(oneTable.onescenario[7]);
        textView9.setText(oneTable.onescenario[8]);
        textView10.setText(oneTable.onescenario[9]);
        textView11.setText(oneTable.onescenario[10]);


        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        textView4.setVisibility(View.INVISIBLE);
        textView5.setVisibility(View.INVISIBLE);
        textView6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
        one_button_next_level.setVisibility(View.INVISIBLE);

        delay.execute();

    }

    @Override
    public void onBackPressed(){
        delay.cancel(true);
        delay=null;
        finish();
    }

    class Delay extends AsyncTask<Void, Integer, Void>{
        @Override
        protected Void doInBackground(Void... params) {
            while (line <= 12) {

                publishProgress(line++);
                try {
                    Thread.sleep(5000);
                    if (isCancelled()) return null;
                } catch(Exception e) {
                }
            }
            return null;
        }


        @Override
        protected void onProgressUpdate (Integer... values){

        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        final TextView textView6 = (TextView) findViewById(R.id.textView6);
        final TextView textView7 = (TextView) findViewById(R.id.textView7);
        final TextView textView8 = (TextView) findViewById(R.id.textView8);
        final TextView textView9 = (TextView) findViewById(R.id.textView9);
        final TextView textView10 = (TextView) findViewById(R.id.textView10);
        final TextView textView11 = (TextView) findViewById(R.id.textView11);
        final Button one_button_next_level = (Button)findViewById(R.id.one_button_next_level);

        final Animation a = AnimationUtils.loadAnimation(One_level.this, R.anim.alpha);

        switch (line){
            case 1: textView1.setVisibility(View.VISIBLE); textView1.startAnimation(a);break;
            case 2: textView2.setVisibility(View.VISIBLE); textView2.startAnimation(a);break;
            case 3: textView3.setVisibility(View.VISIBLE); textView3.startAnimation(a);break;
            case 4: textView4.setVisibility(View.VISIBLE); textView4.startAnimation(a);break;
            case 5: textView5.setVisibility(View.VISIBLE); textView5.startAnimation(a);break;
            case 6: textView6.setVisibility(View.VISIBLE); textView6.startAnimation(a);break;
            case 7: textView7.setVisibility(View.VISIBLE); textView7.startAnimation(a);break;
            case 8: textView8.setVisibility(View.VISIBLE); textView8.startAnimation(a);break;
            case 9: textView9.setVisibility(View.VISIBLE); textView9.startAnimation(a);break;
            case 10: textView10.setVisibility(View.VISIBLE); textView10.startAnimation(a);break;
            case 11: textView11.setVisibility(View.VISIBLE); textView11.startAnimation(a);break;
            case 12: one_button_next_level.setVisibility(View.VISIBLE); one_button_next_level.startAnimation(a);
                buttonmeny.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonmeny.setBackgroundResource(R.drawable.buttonmeny);
                        try {
                            Intent intent = new Intent(MainActivity.this, One_level.class);startActivity(intent);finish();
                        } catch (Exception e) {
                            e.printStackTrace();

            default: break;

        }

    }
    }
    }