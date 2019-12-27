package com.wizardapps.cprogrammingforengineering;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import hotchemi.android.rate.AppRate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {
AdView myAdView;
private InterstitialAd interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

            MobileAds.initialize(this,"ca-app-pub-6692454266263355~7228243477");

        setActivityBackgroundColor();


        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("C Programming");





interstitialAd1=new InterstitialAd(this);
interstitialAd1.setAdUnitId("ca-app-pub-6692454266263355/5750051403");
interstitialAd1.loadAd(new AdRequest.Builder().build());
interstitialAd1.setAdListener(new AdListener()
                             {
                                 @Override
                                 public void onAdClosed() {

                                   startActivity(new Intent(MainActivity.this,Concepts.class));
                                     interstitialAd1.loadAd(new AdRequest.Builder().build());
                                 }
                             }

);


        interstitialAd2=new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-6692454266263355/5750051403");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener()
                                     {
                                         @Override
                                         public void onAdClosed() {

                                             startActivity(new Intent(MainActivity.this,Programs.class));
                                             interstitialAd2.loadAd(new AdRequest.Builder().build());
                                         }
                                     }

        );

        interstitialAd3=new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-6692454266263355/5750051403");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {

                                              startActivity(new Intent(MainActivity.this,Faqs.class));
                                              interstitialAd3.loadAd(new AdRequest.Builder().build());
                                          }
                                      }

        );

        interstitialAd4=new InterstitialAd(this);
        interstitialAd4.setAdUnitId("ca-app-pub-6692454266263355/5750051403");
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {

                                              startActivity(new Intent(MainActivity.this,Exams.class));
                                              interstitialAd4.loadAd(new AdRequest.Builder().build());
                                          }
                                      }

        );

        interstitialAd5=new InterstitialAd(this);
        interstitialAd5.setAdUnitId("ca-app-pub-6692454266263355/5750051403");
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {

                                              startActivity(new Intent(MainActivity.this,Tips.class));
                                              interstitialAd5.loadAd(new AdRequest.Builder().build());
                                          }
                                      }

        );

        AppRate.with(this)
        .setInstallDays(2)
        .setLaunchTimes(3)
                .setRemindInterval(2)
                .monitor();

AppRate.showRateDialogIfMeetsConditions(this);






    }

    //for menu on top right


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.about_us)
        {Intent about_us_intent=new Intent(MainActivity.this,About_Us.class);
        startActivity(about_us_intent);

        }
        if(item.getItemId()==R.id.rate_us)
        {

            launchMarket();
        }
        if(item.getItemId()==R.id.share)
        {
            try {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                String shareMessage= "\nLet me recommend you this application\n\n";
                shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID +"\n\n";
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                startActivity(Intent.createChooser(shareIntent, "choose one"));
            } catch(Exception e) {
                //e.toString();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    public void setActivityBackgroundColor() {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(Color.CYAN);
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setMessage("Do you want to Exit the App?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if_else user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if_else user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }

    public void clickFirst(View view)
    {
        if(interstitialAd1.isLoaded())
        {
            interstitialAd1.show();
        }
        else
        {
            Toast.makeText(this, "Concepts", Toast.LENGTH_SHORT).show();
            Intent i1= new Intent(this,Concepts.class);
            startActivity(i1);
        }





    }

    public void clickSecond(View view)
    {
        if(interstitialAd2.isLoaded())
        {
            interstitialAd2.show();
        }
        else {
            Toast.makeText(this, "Programs", Toast.LENGTH_SHORT).show();
            Intent i2 = new Intent(this, Programs.class);
            startActivity(i2);
        }
    }

    public void clickThird(View view)
    {   if(interstitialAd3.isLoaded())
    {
        interstitialAd3.show();
    }
    else {
        Toast.makeText(this, "FAQs", Toast.LENGTH_SHORT).show();
        Intent i3 = new Intent(this, Faqs.class);
        startActivity(i3);
    }

    }

    public void clickFourth(View view)
    {   if(interstitialAd4.isLoaded())
    {
        interstitialAd4.show();
    }
    else {
        Toast.makeText(this, "Exam Questions", Toast.LENGTH_SHORT).show();
        Intent i4 = new Intent(this, Exams.class);
        startActivity(i4);
    }
    }



    public void clickSixth(View view)
    {   if(interstitialAd5.isLoaded())
    {
        interstitialAd5.show();
    }
    else {
        Toast.makeText(this, "Tips", Toast.LENGTH_SHORT).show();
        Intent i4 = new Intent(this, Tips.class);
        startActivity(i4);
    }
    }
    private void launchMarket() {
        Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent myAppLinkToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            startActivity(myAppLinkToMarket);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, " unable to find market app", Toast.LENGTH_LONG).show();
        }
    }





}



