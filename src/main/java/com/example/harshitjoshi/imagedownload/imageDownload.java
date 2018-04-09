package com.example.harshitjoshi.imagedownload;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imageDownload extends AppCompatActivity {
    Button button;
    DownloadManager downloadmanager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageDownload);
        button=findViewById(R.id.downloadbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            downloadmanager= (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
            Uri uri=Uri.parse("http://www.baltana.com/files/wallpapers-4/Eminem-Quotes-Wallpaper-HD-14248.jpg");
            DownloadManager.Request request=new DownloadManager.Request(uri);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            Long reference=downloadmanager.enqueue(request);
            }
        });
    }

}
