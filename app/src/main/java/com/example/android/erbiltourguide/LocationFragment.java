package com.example.android.erbiltourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {

    public LocationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // declares an Array_list of strings and allocates memory for 10 strings
        final ArrayList<Word> words = new ArrayList<Word>();

        // initialize first element
        words.add(new Word( getString(R.string.Family_addr),getString(R.string.Family)));
        words.add(new Word(  getString(R.string.Sami_addr),getString(R.string.Sami)));
        words.add(new Word(  getString(R.string.Korek_addr),getString(R.string.Korek)));
        words.add(new Word(  getString(R.string.Aqua_addr),getString(R.string.Aqua)));
        words.add(new Word(  getString(R.string.Cita_addr),getString(R.string.Cita)));
        words.add(new Word(  getString(R.string.Dawa2_addr),getString(R.string.Dawa2)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}


