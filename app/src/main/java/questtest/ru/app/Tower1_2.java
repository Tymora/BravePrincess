package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tower1_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower1_2);
        final Button ru_button_next_level = (Button) findViewById(R.id.button_back1_2);
        ru_button_next_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ru_button_next_level.setBackgroundResource(R.drawable.ru_button_next_level);
                try {
                    Intent intent = new Intent(Tower1_2.this, Tower_Six.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
