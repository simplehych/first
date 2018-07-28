package com.simple.review.distribute;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.simple.review.R;

/**
 * @author hych
 * @date 2018/7/28 13:05
 */
public class DistributeActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribute);
        Button button = (Button) findViewById(R.id.distribute_act_button);
        ImageView imageView = (ImageView) findViewById(R.id.distribute_act_iv);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, TAG + " button onClick execute ");
            }
        });
        button.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(TAG, TAG + " button  onTouch execute, event: " + event.getAction());
                return true;
            }
        });

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(TAG, TAG + " imageView onTouch execute, event: " + event.getAction());
                return false;
            }
        });
    }

}
