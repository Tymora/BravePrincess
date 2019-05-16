package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower1_3);
        final Button ru_button_next_level = (Button) findViewById(R.id.button1);
        ru_button_next_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ru_button_next_level.setBackgroundResource(R.drawable.ru_button_next_level);
                try {
                    Intent intent = new Intent(Tower10.this, Tower_Five.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
