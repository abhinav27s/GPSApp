package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ActivityTTFF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ttff_result_view);

        TableLayout root = (TableLayout) findViewById(R.id.parent_table);

        TableRow row= new TableRow(this);
        TableRow.LayoutParams lp = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);
        row.setLayoutParams(lp);
        TextView s_no = new TextView(this);
        TextView lat = new TextView(this);
        TextView lon = new TextView(this);
        TextView ttff = new TextView(this);
        s_no.setText("1");

        row.addView(s_no);
        row.addView(lat);
        row.addView(lon);
        row.addView(ttff);
        root.addView(row);
    }
}
