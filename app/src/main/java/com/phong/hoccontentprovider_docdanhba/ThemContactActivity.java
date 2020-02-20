package com.phong.hoccontentprovider_docdanhba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ThemContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_contact);
    }

    public void xuLyThemContact(View view) {
        Toast.makeText(ThemContactActivity.this,"Bạn gọi lệnh thêm ở đây!",Toast.LENGTH_LONG).show();
        finish();
    }
}
