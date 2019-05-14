package questtest.ru.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button buttonmeny = (Button) findViewById(R.id.menuButton);
        buttonmeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonmeny.setBackgroundResource(R.drawable.buttonmeny);
                try {
                    Intent intent = new Intent(MainActivity.this, Tower_Six.class);startActivity(intent);finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
