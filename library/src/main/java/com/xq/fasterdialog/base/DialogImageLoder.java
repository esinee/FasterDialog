package com.xq.fasterdialog.base;

import android.content.Context;
import android.widget.ImageView;

public interface DialogImageLoder {

    public void loadImage(Context context, ImageView view, String url, Object... object);

}