package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower_Four extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower_four);
        final Button button_one4 = (Button) findViewById(R.id.button_one4);
        final Button button_two4 = (Button) findViewById(R.id.button_two4);
        final Button button_three4 = (Button) findViewById(R.id.button_three4);
        button_one4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_one4.setBackgroundResource(R.drawable.button_one);
                try {
                    Intent intent = new Intent(Tower_Four.this, Tower4_1.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        button_two4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_two4.setBackgroundResource(R.drawable.button_two);
                try {
                    Intent intent = new Intent(Tower_Four.this, Tower43.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        button_three4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_three4.setBackgroundResource(R.drawable.button_three);
                try {
                    Intent intent = new Intent(Tower_Four.this, Tower4_2.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
