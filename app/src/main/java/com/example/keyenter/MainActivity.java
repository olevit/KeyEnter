package com.example.keyenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements TextView.OnEditorActionListener {
    EditText editSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editSearch = findViewById(R.id.editSearch);
        editSearch.setOnEditorActionListener(this);
        EditText editGo = findViewById(R.id.editGo);
        editGo.setOnEditorActionListener(this);
        /*EditText editSend = findViewById(R.id.editSend);
        editSend.setOnEditorActionListener(this);
        EditText editNext = findViewById(R.id.editNext);
        editNext.setOnEditorActionListener(this);
        EditText editDone = findViewById(R.id.editDone);
        editDone.setOnEditorActionListener(this);*/
    }
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
        if (actionId == EditorInfo.IME_ACTION_SEARCH){
            if(!editSearch.getText().toString().equals("cat")){
                Toast.makeText(this, "Не буду нічого шукати!", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        if(actionId == EditorInfo.IME_ACTION_GO){
            return true;
        }
        return false;
        /*if(actionId == EditorInfo.IME_ACTION_DONE || actionId == R.id.action_sign_in){
            if(editDone.getText().toString() != "кіт") {
                Toast.makeText(this, "Не буду нічого шукати!", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        return false;*/
    }

}
