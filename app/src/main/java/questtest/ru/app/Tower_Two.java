package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower_Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower_two);
        final Button button_one2 = (Button) findViewById(R.id.button_one2);
        final Button button_two2 = (Button) findViewById(R.id.button_two2);
        final Button button_three2 = (Button) findViewById(R.id.button_three2);
        button_one2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_one2.setBackgroundResource(R.drawable.button_one);
                try {
                    Intent intent = new Intent(Tower_Two.this, Tower2_1.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        button_two2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_two2.setBackgroundResource(R.drawable.button_two);
                try {
                    Intent intent = new Intent(Tower_Two.this, Tower2_2.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        button_three2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_three2.setBackgroundResource(R.drawable.button_three);
                try {
                    Intent intent = new Intent(Tower_Two.this, Tower21.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

