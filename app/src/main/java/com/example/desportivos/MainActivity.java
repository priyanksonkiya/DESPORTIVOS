package com.example.desportivos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.felipecsl.gifimageview.library.GifImageView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {

    private GifImageView gifImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Html.fromHtml("<font color='#ff0000'>Desportivos'20 </font>"));
        setContentView(R.layout.activity_main);

        ImageView menu = (ImageView) findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent menuIntent = new Intent(MainActivity.this, navMenu.class);
                startActivity(menuIntent);
            }
        });

        ImageView fb = findViewById(R.id.fb);

        fb.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity

                // Start the new activity
                Uri uri = Uri.parse("https://www.facebook.com/Desportivos.LNMIIT/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        ImageView insta = findViewById(R.id.insta);

        insta.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity

                // Start the new activity
                Uri uri = Uri.parse("https://www.instagram.com/desportivos.lnmiit/"); // missing 'http://' will cause crashed
                Intent intent = new Intent(ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView yt = findViewById(R.id.yt);

        yt.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity

                // Start the new activity
                Uri uri = Uri.parse("https://www.youtube.com/channel/UCQpn6OkgdHV5sy2qWIcADqA"); // missing 'http://' will cause crashed
                Intent intent = new Intent(ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        gifImageView = findViewById(R.id.gifImageView);

        //Set GIFImageView resource
        try{
            InputStream inputStream = getAssets().open("despologo.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }
        catch (IOException ex)
        {

        }


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O )
        {
            NotificationChannel channel = new NotificationChannel("Alerts","Alerts", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "S";
                        if (!task.isSuccessful()) {
                            msg = "F";
                        }
                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });




    }
}
