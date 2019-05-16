package questtest.ru.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Tower_Six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tower_six);
        final Button button_one6 = (Button) findViewById(R.id.button_one6);
        final Button button_two6 = (Button) findViewById(R.id.button_two6);
        final Button button_three6 = (Button) findViewById(R.id.button_three6);
        button_one6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button_one6.setBackgroundResource(R.drawable.button_one);
                Switch(v.getId()){
                    case R.id.button_back6_1


            }
        });
    }
}
