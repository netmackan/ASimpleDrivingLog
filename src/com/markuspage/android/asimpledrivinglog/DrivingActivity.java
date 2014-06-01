/*
 *  Copyright (C) 2014 Markus Kilås
 *
 *  This file is part of A Simple Driving Log.
 *
 *  A Simple Driving Log is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  A Simple Driving Log is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with A Simple Driving Log. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.markuspage.android.asimpledrivinglog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DrivingActivity extends Activity implements View.OnClickListener
{
    private boolean started;
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        findViewById(R.id.button_send).setOnClickListener(this);
        switchMode();
    }
    
    private void switchMode() {
        
        findViewById(R.id.edit_vehicle).setEnabled(!started);
        
        // Started views
        findViewById(R.id.prev_odometer).setVisibility(started ? View.VISIBLE : View.INVISIBLE);
        findViewById(R.id.prev_odometer_value).setVisibility(started ? View.VISIBLE : View.INVISIBLE);
        findViewById(R.id.start_time).setVisibility(started ? View.VISIBLE : View.INVISIBLE);
        
        
        // Not in started
        findViewById(R.id.current_odometer).setVisibility(started ? View.INVISIBLE : View.VISIBLE);
        findViewById(R.id.edit_odometer).setVisibility(started ? View.INVISIBLE : View.VISIBLE);
//        findViewById(R.id.).setVisibility(started ? View.INVISIBLE : View.VISIBLE);
        
        ((Button) findViewById(R.id.button_send)).setText(started ? R.string.button_stop : R.string.button_start);
        
    }

    public void onClick(View arg0) {
        Log.i("driving", "Clicked: " + arg0);
//        started = !started;
//        switchMode();
        
        if (started) {
            Intent intent = new Intent(this, FinishTripActivity.class);
//            intent.putExtra(TASK_ID, selectedTask.getId());
//            if (adapter.currentRangeStart != -1) {
//                intent.putExtra(START, adapter.currentRangeStart);
//                intent.putExtra(END, adapter.currentRangeEnd);
//            }
            startActivity(intent);
        } else {
            started = true;
            switchMode();
        }
        
    }
    
    
}
