/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.markuspage.android.asimpledrivinglog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 *
 * @author markus
 */
public class FinishTripActivity extends Activity implements View.OnClickListener {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.finish);
        findViewById(R.id.edit_vehicle).setEnabled(false);
        findViewById(R.id.button_save).setOnClickListener(this);
        findViewById(R.id.button_save_edit).setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_save: {
                Intent intent = new Intent(this, LogActivity.class);
//            intent.putExtra(TASK_ID, selectedTask.getId());
//            if (adapter.currentRangeStart != -1) {
//                intent.putExtra(START, adapter.currentRangeStart);
//                intent.putExtra(END, adapter.currentRangeEnd);
//            }
                startActivity(intent);
                finish();
                break;
            }
            case R.id.button_save_edit: {
                Intent intent = new Intent(this, EditTripActivity.class);
//            intent.putExtra(TASK_ID, selectedTask.getId());
//            if (adapter.currentRangeStart != -1) {
//                intent.putExtra(START, adapter.currentRangeStart);
//                intent.putExtra(END, adapter.currentRangeEnd);
//            }
                startActivity(intent);
                finish();
                break;
            }
            default:
                break;
        }
    }

}
