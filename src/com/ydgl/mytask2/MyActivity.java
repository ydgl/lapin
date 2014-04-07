

package com.ydgl.mytask2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onClic(View v) {


        EditText t = (EditText) findViewById(R.id.editText);


        Log.i("test",t.getText().toString());

        // RequestFocus(int)
        t.setVisibility(View.VISIBLE);
        t.requestFocus();

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(t, InputMethodManager.SHOW_IMPLICIT);
    }

}
