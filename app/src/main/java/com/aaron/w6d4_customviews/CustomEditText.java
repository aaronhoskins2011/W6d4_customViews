package com.aaron.w6d4_customviews;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

/**
 * Created by aaron on 9/8/17.
 */

public class CustomEditText extends android.support.v7.widget.AppCompatEditText {
    int color = R.color.colorPrimary;

    public CustomEditText(Context context, AttributeSet attrs) throws InterruptedException {
        super(context, attrs);

            changeColor();
            this.setBackgroundColor(getResources().getColor(color));
  



    }

   public void changeColor(){
        if (color == R.color.colorPrimary) {
            color = R.color.colorAccent;
        } else {
            color = R.color.colorPrimary;
        }
    }

}
