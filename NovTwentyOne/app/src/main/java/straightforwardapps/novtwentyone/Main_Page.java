package straightforwardapps.novtwentyone;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Main_Page extends AppCompatActivity {


    RadioGroup rg;
    RadioButton rb;
    RadioButton rr;
    FrameLayout mp;
    TextView tv;
    EditText et;
    Button bt;
    RelativeLayout whole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main__page);

        rg = (RadioGroup) findViewById(R.id.rgroup);
        rb = (RadioButton) findViewById(R.id.rblack);
        rr = (RadioButton) findViewById(R.id.rred);
        mp = (FrameLayout) findViewById(R.id.mainpage);
        tv = (TextView) findViewById(R.id.col_name);
        et = (EditText) findViewById(R.id.textb);
        bt = (Button) findViewById(R.id.okb);
        whole = (RelativeLayout) findViewById(R.id.main__page);

    }

    public void rrb(View v)
    {
        if(rb.isChecked())
        {
           //Toast.makeText(this, "Black", Toast.LENGTH_SHORT).show();
            mp.setBackgroundColor(Color.parseColor("Black"));//Change Color
            rb.setTextColor(Color.parseColor("Red"));
            rr.setTextColor(Color.parseColor("Red"));
            tv.setText("BLACK");
        }
        else if(rr.isChecked())
        {
            //Toast.makeText(this, "Red", Toast.LENGTH_SHORT).show();
            mp.setBackgroundColor(Color.parseColor("Red"));//Change Color
            rb.setTextColor(Color.parseColor("Black"));
            rr.setTextColor(Color.parseColor("Black"));
            tv.setText("RED");
        }

    }

    public void chcol(View v)
    {
        String rung = et.getText().toString();
        try{
        mp.setBackgroundColor(Color.parseColor(rung));//Change Color
        rb.setTextColor(Color.parseColor(rung));
        rr.setTextColor(Color.parseColor(rung));
        tv.setText(rung);}

        catch(Exception e)
        {
            Toast.makeText(this, "Invalid Color Code", Toast.LENGTH_SHORT).show();
        }

    }

    public void askback(View v)
    {
        String rung = et.getText().toString();
        try {
            whole.setBackgroundColor(Color.parseColor(rung));
            rb.setTextColor(Color.parseColor("white"));
            rr.setTextColor(Color.parseColor("white"));
        }
        catch(Exception e)
        {
            Toast.makeText(this, "Invalid Color Code", Toast.LENGTH_SHORT).show();
        }
    }
}

