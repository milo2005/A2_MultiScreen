package unicauca.movil.holamundo.multiscreen.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import unicauca.movil.holamundo.multiscreen.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {


    public interface ListFragmentI{
        void onColorSelected(int color);
    }

    ListView list;
    ListFragmentI listFragmentI;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listFragmentI = (ListFragmentI) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.f_list, container, false);
        list = (ListView) v.findViewById(R.id.list);

        list.setOnItemClickListener(this);



        return v;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        listFragmentI.onColorSelected(position);
    }
}
