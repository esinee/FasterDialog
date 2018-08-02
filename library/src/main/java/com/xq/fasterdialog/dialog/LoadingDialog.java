package com.xq.fasterdialog.dialog;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.TextView;

import com.xq.fasterdialog.R;
import com.xq.fasterdialog.base.BaseDialog;

public class LoadingDialog extends BaseDialog<LoadingDialog> {

    private TextView loadingView;

    private CharSequence loadingText;

    public LoadingDialog(@NonNull Context context) {
        super(context,R.style.MaterialDialog);
    }

    @Override
    protected void init() {
        super.init();

        setCancele(false);

        setCustomView(R.layout.layout_loadingdialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadingView = findViewById(context.getResources().getIdentifier("loadingView", "id", context.getPackageName()));

        setLodingText(loadingText);
    }

    public LoadingDialog setLodingText(CharSequence loadingText) {
        this.loadingText = loadingText;
        setTextToView(loadingView,loadingText);
        return this;
    }

    public CharSequence getLodingText() {
        return loadingText;
    }
}
