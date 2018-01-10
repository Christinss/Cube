package kristina_knezevic.helloworld;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bPrvi;
    private Button bDrugi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bPrvi = (Button) findViewById(R.id.bPrvi);
        bPrvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Kliknut je prvi gumb.", Toast.LENGTH_LONG).show();
                Log.i("MA", "Gumb prvi kliknut");
            }
        });

        bDrugi = (Button) findViewById(R.id.bDrugi);
        bDrugi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Kliknut je drugi gumb.", Toast.LENGTH_LONG).show();
            }
        });


    }

}
