package com.tutor.drawertestojlvb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ResultScreen extends AppCompatActivity {

   // private List<AnswerList> list = generateAnswerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen_activity);

        RecyclerView answerRecycler = findViewById(R.id.answers_recycler_view);
        answerRecycler.setLayoutManager(new LinearLayoutManager(this));
       // AnswerAdapter answerAdapter = new AnswerAdapter(list, this);
        //answerAdapter.setAdapter(answerAdapter);

    }

    private List<AnswerList> generateAnswerList() {
        List<AnswerList> list = new ArrayList<>();
        //list.add(new AnswerList()) А ЯК БАЗА ДАНИХ СЮДИ?
        return list;
    }

}
