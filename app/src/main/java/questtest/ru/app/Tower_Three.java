package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower_Three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower_three);
        final Button button_one3 = (Button) findViewById(R.id.button_one3);
        final Button button_two3 = (Button) findViewById(R.id.button_two3);
        final Button button_three3 = (Button) findViewById(R.id.button_three3);
        button_one3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_one3.setBackgroundResource(R.drawable.button_one);
                try {
                    Intent intent = new Intent(Tower_Three.this, Tower3_1.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        button_two3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_two3.setBackgroundResource(R.drawable.button_two);
                try {
                    Intent intent = new Intent(Tower_Three.this, Tower32.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        button_three3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_three3.setBackgroundResource(R.drawable.button_three);
                try {
                    Intent intent = new Intent(Tower_Three.this, Tower3_2.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}