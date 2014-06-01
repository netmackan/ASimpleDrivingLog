/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.markuspage.android.asimpledrivinglog;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 *
 * @author markus
 */
public class LogActivity extends ListActivity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setListAdapter(new BaseAdapter() {

            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int arg0) {
                return "Start new trip";
            }

            @Override
            public long getItemId(int arg0) {
                return 0;
            }

            @Override
            public View getView(int arg0, View arg1, ViewGroup arg2) {
                TextView view = new TextView(LogActivity.this);
                view.setText("Start...");
                return view;
            }
        });
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(this, DrivingActivity.class);
//            intent.putExtra(TASK_ID, selectedTask.getId());
//            if (adapter.currentRangeStart != -1) {
//                intent.putExtra(START, adapter.currentRangeStart);
//                intent.putExtra(END, adapter.currentRangeEnd);
//            }
        startActivity(intent);
    }
    
    

}
