package com.youtube.youtube;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ehdql on 2017-07-28.
 */

public class bjlist_beautyActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bjlist_beauty);

    }

    public void onButton8Clicked(View v) {
        // 인텐트 객체를 만듭니다.
        Uri uri = Uri.parse("http://www.youtube.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        startActivity(intent);
    }
}

