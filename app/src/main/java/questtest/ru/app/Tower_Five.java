package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower_Five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower_five);
        final Button button_one5 = (Button) findViewById(R.id.button_one5);
        final Button button_two5 = (Button) findViewById(R.id.button_two5);
        final Button button_three5 = (Button) findViewById(R.id.button_three5);
        button_one5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_one5.setBackgroundResource(R.drawable.button_one);
                try {
                    Intent intent = new Intent(Tower_Five.this, Tower54.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
        button_two5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_two5.setBackgroundResource(R.drawable.button_two);
                try {
                    Intent intent = new Intent(Tower_Five.this, Tower5_1.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        button_three5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_three5.setBackgroundResource(R.drawable.button_three);
                try {
                    Intent intent = new Intent(Tower_Five.this, Tower5_2.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
