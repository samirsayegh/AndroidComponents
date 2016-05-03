package com.samirsayegh.mycomponents.views.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;


import com.samirsayegh.mycomponents.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yormirsamir.sayegh on 03/05/2016.
 */
public class ImageTextValue extends RelativeLayout {


    ImageView imageViewImageTextValue;

    public ImageTextValue(Context context) {
        super(context);
        init();
    }

    public ImageTextValue(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ImageTextValue(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(infService);
        layoutInflater.inflate(R.layout.image_text_value, this);
        ButterKnife.bind(this);
    }

    private void getAttributeSet(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.ImageTextValue);
        int imageSource = typedArray.getInteger(R.styleable.ImageTextValue_image_src, 0);
        if (imageSource != 0)
            imageViewImageTextValue.setImageDrawable(getResources().getDrawable(imageSource));
    }
}
