package com.naosim.samplelab.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class SecondActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        findViewById(R.id.redButton).setOnClickListener(this);
        findViewById(R.id.greenButton).setOnClickListener(this);
        findViewById(R.id.blueButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Theme.Type type;
        switch (view.getId()) {
            case R.id.redButton:
                type = Theme.Type.RED;
                break;
            case R.id.greenButton:
                type = Theme.Type.GREEN;
                break;
            case R.id.blueButton:
                type = Theme.Type.BLUE;
                break;
            default:
                type = Theme.Type.RED;
        }

        Theme.getInstance().setType(type);
        finish();
    }
}
