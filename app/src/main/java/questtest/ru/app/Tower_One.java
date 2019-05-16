package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower_One extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower_one);
        final Button button_one1 = (Button) findViewById(R.id.button_one1);
        final Button button_two1 = (Button) findViewById(R.id.button_two1);
        final Button button_three1 = (Button) findViewById(R.id.button_three1);
        button_one1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_one1.setBackgroundResource(R.drawable.button_one);
                try {
                    Intent intent = new Intent(Tower_One.this, Tower1_1.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        button_two1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_two1.setBackgroundResource(R.drawable.button_two);
                try {
                    Intent intent = new Intent(Tower_One.this, Tower1_2.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        button_three1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_three1.setBackgroundResource(R.drawable.button_three);
                try {
                    Intent intent = new Intent(Tower_One.this, Tower10.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
