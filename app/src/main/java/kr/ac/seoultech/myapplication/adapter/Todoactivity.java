package kr.ac.seoultech.myapplication.adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.ac.seoultech.myapplication.model.Todo;

/**
 * Created by SEO on 2017-06-28.
 */

public class Todoactivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private ListView listView;
    private  List<Todo>findTodoList() {
         List<Todo> list = new ArrayList<>();
        for (int i =0; i<40; i++);

            return list;
    }


}
