package com.maharjan.tablayout.design.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.maharjan.tablayout.R;
import com.maharjan.tablayout.adapter.ContactsAdapters;

import java.util.ArrayList;
import java.util.List;

import com.maharjan.tablayout.Contacts;

public class HomeFragment extends Fragment {
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView=root.findViewById(R.id.recyclerView);
        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Bhuwan","9898765684",R.drawable.bhuwan));
        contactsList.add(new Contacts("Nikhil","9889765423",R.drawable.noimage));
        contactsList.add(new Contacts("Dahayang","9857438833",R.drawable.dahayang));
        contactsList.add(new Contacts("Saugat","9867884743",R.drawable.saugat));
        contactsList.add(new Contacts("Sanjeeb","9887654263",R.drawable.bhuwan));
        contactsList.add(new Contacts("Naresh","9887678903",R.drawable.saugat));
        contactsList.add(new Contacts("Samyam","9894873732",R.drawable.dahayang));
        contactsList.add(new Contacts("Sandip","9846473823",R.drawable.noimage));
        contactsList.add(new Contacts("Maneesh","9860738563",R.drawable.noimage));
        contactsList.add(new Contacts("Nabin","9861537426",R.drawable.dahayang));
        contactsList.add(new Contacts("Raja","9813064244",R.drawable.noimage));
        contactsList.add(new Contacts("Abhi","9815783636",R.drawable.noimage));
        contactsList.add(new Contacts("Ashok","9841678932",R.drawable.dahayang));
        ContactsAdapters contactsAdapter = new ContactsAdapters(getActivity(),contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}
