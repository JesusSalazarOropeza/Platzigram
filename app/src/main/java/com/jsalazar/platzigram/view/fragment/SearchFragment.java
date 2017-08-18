package com.jsalazar.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.jsalazar.platzigram.R;
import com.jsalazar.platzigram.adapter.PictureAdapterRecyclerView;
import com.jsalazar.platzigram.model.Picture;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search,container,false);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.searchRecyclerView);

        GridLayoutManager gridLayoutManager= new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
       picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView= new PictureAdapterRecyclerView( buildPictures(),R.layout.cardview_picture,getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }
    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://s-media-cache-ak0.pinimg.com/originals/6b/2e/23/6b2e2334fa22dad46de88b32ce593c0e.jpg","Uriel Ramirez","4 dias","3 Me gusta"));
        pictures.add(new Picture("https://s-media-cache-ak0.pinimg.com/originals/f9/d4/20/f9d420388a40f435cc4ed86405d6a2ff.jpg","Juan Pablo","3 dias","10 Me gusta"));
        pictures.add(new Picture("https://s-media-cache-ak0.pinimg.com/736x/81/5c/29/815c29eec5496b8c6cc3cc49b2228e1d--harry-draco-harry-potter-art.jpg","Anahi Salgado","2 dias","9Me gusta"));
        return pictures;
    }

}
