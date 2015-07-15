package unicauca.movil.holamundo.multiscreen;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import unicauca.movil.holamundo.multiscreen.fragments.ColorFragment;


public class ColorActivity extends ActionBarActivity {

    public static final String KEY_POS="pos";
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Bundle extras = getIntent().getExtras();
        pos = extras.getInt(KEY_POS);

        ColorFragment colorF =  new ColorFragment();
        colorF.init(pos);

        FragmentTransaction fT = getSupportFragmentManager().beginTransaction();
        fT.replace(R.id.container, colorF);
        fT.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
