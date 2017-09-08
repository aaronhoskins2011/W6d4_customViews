package com.aaron.w6d4_customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by aaron on 9/7/17.
 */

public class CustomView extends View {
    int top;
    int bottom;
    int left;
    int right;
    int color;


    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.CustomView,0,0);
        top = typedArray.getInt(R.styleable.CustomView_top,100);
        bottom = typedArray.getInt(R.styleable.CustomView_bottom,50);
        left = typedArray.getInt(R.styleable.CustomView_left,10);
        right = typedArray.getInt(R.styleable.CustomView_right,60);
        color = typedArray.getInt(R.styleable.CustomView_color,0);
    }
    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        Rect rect = new Rect(top,bottom,left,right);
        Paint paint1 = new Paint();
        paint1.setColor(color);
        canvas.drawRect(rect,paint1);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

}
