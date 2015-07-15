package unicauca.movil.holamundo.multiscreen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import unicauca.movil.holamundo.multiscreen.fragments.ColorFragment;
import unicauca.movil.holamundo.multiscreen.fragments.ListFragment;


public class MainActivity extends AppCompatActivity implements ListFragment.ListFragmentI {

    boolean port, phone;

    ColorFragment colorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        port = getResources().getBoolean(R.bool.port);
        phone = getResources().getBoolean(R.bool.phone);

        if(!port && !phone)
            colorFragment = (ColorFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.color_content);

    }

    @Override
    public void onColorSelected(int color) {
        if(colorFragment != null){
            colorFragment.setColor(color);
        }else{
            Intent intent =  new Intent(this, ColorActivity.class);
            intent.putExtra(ColorActivity.KEY_POS, color);

            startActivity(intent);
        }


    }
}
