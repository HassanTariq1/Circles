package com.itpvt.circle;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.PhoneNumberUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    ImageView insta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.main_navigation);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        TextView textView=(TextView)findViewById(R.id.textView4) ;
        //facebook=(FloatingActionButton) findViewById(R.id.fb);
        ImageView img1 = (ImageView) findViewById(R.id.neww);
        ImageView img2 = (ImageView) findViewById(R.id.newww);
//        insta= (ImageView) findViewById(R.id.insta);
    //    whatsapp=(FloatingActionButton) findViewById(R.id.whatsapp);
        //  sliderLayout = (SliderLayout) findViewById(R.id.slider);

//
//        insta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/madame_ready_to_wear"));
//                startActivity(i);
//            }
//        });
//
//        instagram.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://madame_ready_to_wear/"));
//
//                startActivity(myIntent);
//            }
//        });



//        whatsapp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String smsNumber = "923113668542";
//
//                Intent sendIntent = new Intent("android.intent.action.MAIN");
//                sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
//                sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix
//                startActivity(sendIntent);
//
//
//            }
//
//        });
//
//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, All_Products_Design.class);
//                intent.putExtra("id", "34");
//                intent.putExtra("title", "Hello");
//
//                startActivity(intent);
//
//
//            }
//        });
        ImageView bag=(ImageView)findViewById(R.id.bag);

        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in=new Intent(MainActivity.this,My_Cart.class);
                startActivity(in);
            }
        });

//        facebook.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent facebookIntent = openFacebook(MainActivity.this);
//                startActivity(facebookIntent);
//            }
//        });
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://footlib.com/"));
//                startActivity(myIntent);
//            }
//        });
//
//        ImageView im2 = (ImageView) findViewById(R.id.img2);
//        im2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,Casual.class);
//
//
//                startActivity(intent);
//
//            }
//        });

//
//        ImageView im3 = (ImageView) findViewById(R.id.img3);
//        im3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Formal.class);
//
//                startActivity(intent);
//
//            }
//
//        });



        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent in=new Intent(MainActivity.this,All_Products_Design.class);
        in.putExtra("id","3");
        in.putExtra("title","Hello");
        startActivity(in);

            }

        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in=new Intent(MainActivity.this,All_Products_Design.class);
                in.putExtra("id","2");
                in.putExtra("title","Hello");
                startActivity(in);
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.Home)
        {
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
//            intent.putExtra("id","55");
//            intent.putExtra("title","Categories");
            startActivity(intent);

        } else if (id == R.id.Categories){

            Intent intent = new Intent(MainActivity.this, MainActivity.class);
//            intent.putExtra("id", "56");
//            intent.putExtra("title", "Hello");

            startActivity(intent);


        } else if (id == R.id.Cart) {

            Intent i= new Intent(MainActivity.this, My_Cart.class);
            startActivity(i);
            finish();

        } else if (id == R.id.Whatsapp)
        {
            String smsNumber = "923113668542";

            Intent sendIntent = new Intent("android.intent.action.MAIN");
            sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix
            startActivity(sendIntent);

        } else if (id == R.id.Innovators)
        {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://itpvt.net/"));
            startActivity(myIntent);

        }else if (id == R.id.web) {

            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://footlib.com/"));
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
//
//    public static Intent openFacebook(Context context) {
//
//        try {
//            context.getPackageManager()
//                    .getPackageInfo("com.facebook.katana", 0);
//            return new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("fb://page/1192767844126708?referrer=app_link"));
//        } catch (Exception e) {
//
//            return new Intent(Intent.ACTION_VIEW,
//                    Uri.parse("https://www.facebook.com/footlib/"));
//        }
//
//    }

}
