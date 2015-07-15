package unicauca.movil.holamundo.multiscreen.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import unicauca.movil.holamundo.multiscreen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    int pos;
    TextView txt;
    String colorsN[];
    int colors[];
    View v;

    public ColorFragment() {
        // Required empty public constructor
    }


    public void init(int pos){
        this.pos = pos;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_color, container, false);
        txt = (TextView) v.findViewById(R.id.txt);

        colors = getActivity().getResources()
                .getIntArray(R.array.colores);

        colorsN = getActivity().getResources()
                .getStringArray(R.array.colores_name);

        txt.setText(colorsN[pos]);
        v.setBackgroundColor(colors[pos]);

        return  v;
    }

    public void setColor(int color){
        txt.setText(colorsN[color]);
        v.setBackgroundColor(colors[color]);
    }


}
