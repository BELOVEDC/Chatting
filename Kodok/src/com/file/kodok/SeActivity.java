package com.file.kodok;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//pilih = getIntent().getIntExtra("pilihan2", 3);
		//pilih = getIntent().getIntExtra("pilihan3", 3);
		//pilih = getIntent().getIntExtra("pilihan4", 3);
		switch(getIntent().getIntExtra("pilihanku", 3)){
		case 1:
		TextView view = new TextView(this);
		view.setText("myText");
		setContentView(view);
		break;
		case 2:
			int hight = LayoutParams.MATCH_PARENT;
			int width = LayoutParams.MATCH_PARENT;
			int nduwur = LayoutParams.WRAP_CONTENT;
			LinearLayout ll = new LinearLayout(this);
			ll.setOrientation(LinearLayout.HORIZONTAL);
			EditText ed = new EditText(this);
			ed.setHint("lebokno text");
			ed.setSingleLine(false);
			Button btn = new Button(this);
			btn.setText("kirim");
			ll.addView(ed,new LayoutParams(550,nduwur,5));
			ll.addView(btn, new LayoutParams(nduwur, nduwur,1));
			setContentView(ll,new LayoutParams(hight, width));
			break;
		case 3:
			view = new TextView(this);
			view.setText("");
			setContentView(view);
			break;
		case 4:
			view = new TextView(this);
			view.setText("");
			setContentView(view);
	}
}
	
	

}
