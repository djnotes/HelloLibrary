package com.udemy.hello;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import util.Images;

/**
 * Created by johndoe on 1/4/18.
 */

public class HelloView extends LinearLayout {
    private static int mIndex = 0;

    public HelloView(Context context) {
        super(context);
        init(context);
    }

    public HelloView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        inflate(context, R.layout.hello, this);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup root = findViewById(R.id.root);

                //Reset index if necessary
                if (mIndex + 1 >= util.Images.size()) {
                    mIndex = 0;
                }
                root.setBackground(getResources().getDrawable(Images.bg[++mIndex], null));
            }
        });
    }
}
