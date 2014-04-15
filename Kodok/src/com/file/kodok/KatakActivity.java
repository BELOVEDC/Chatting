package com.file.kodok;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class KatakActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katak);
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost() ;  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent,i,a,b;  // Reusable Intent for each tab
 
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, SeActivity.class);
        i = new Intent().setClass(this, SeActivity.class);
        a = new Intent().setClass(this, SeActivity.class);
        b = new Intent().setClass(this, SeActivity.class);
        intent.putExtra("pilihanku", 1);
        i.putExtra("pilihanku", 4);
        a.putExtra("pilihanku", 2);
        b.putExtra("pilihanku", 3);
        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("search").setIndicator("",res.getDrawable(R.drawable.ic_menu_search))
                      .setContent(intent);
        tabHost.addTab(spec);
 
        // Points tabs
        //intent = new Intent().setClass(this, Points.class);
        //intent.putExtra("choose", 2);
        spec = tabHost.newTabSpec("points").setIndicator("",res.getDrawable(R.drawable.ic_vibrate))
                      .setContent(a);
        tabHost.addTab(spec);
 
        // Social tabs
        //intent = new Intent().setClass(this, Social.class);
        //intent.putExtra("wrong", 3);
        spec = tabHost.newTabSpec("social").setIndicator("",res.getDrawable(R.drawable.ic_menu_copy_holo_light))
                      .setContent(b);
        tabHost.addTab(spec);
 
        // Contact tabs
        //intent = new Intent();//.setClass(this, Contact.class);
        //intent.putExtra("pilihan4", 4);
        spec = tabHost.newTabSpec("contact").setIndicator("",res.getDrawable(R.drawable.ic_menu_cut))
                      .setContent(i);
        tabHost.addTab(spec);
 
        tabHost.setCurrentTab(0);
        
    }



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.katak, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
