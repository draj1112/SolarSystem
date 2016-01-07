package sidespell.tech.solarsystem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        img = (ImageView) findViewById(R.id.imageView);

        final Spinner spinner = (Spinner) findViewById(R.id.testSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Planets);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> id, View rootView,
                                       int pos, long arg3) {

                if (pos == 1) {
                    img.setImageResource(R.drawable.mercury);
                } else if (pos == 2) {
                    img.setImageResource(R.drawable.venus);
                } else if (pos == 3) {
                    img.setImageResource(R.drawable.earth);
                } else if (pos == 4) {
                    img.setImageResource(R.drawable.mars);
                } else if (pos == 5) {
                    img.setImageResource(R.drawable.jupiter);
                } else if (pos == 6) {
                    img.setImageResource(R.drawable.saturn);
                } else if (pos == 7) {
                    img.setImageResource(R.drawable.uranus);
                } else if (pos == 8) {
                    img.setImageResource(R.drawable.neptune);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }

        });


        return;

    }

    static final String[] Planets = new String[] { "Mercury", "Venus",
            "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

}
