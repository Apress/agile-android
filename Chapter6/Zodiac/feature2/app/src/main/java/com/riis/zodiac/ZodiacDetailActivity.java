package com.riis.zodiac;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Godfrey on 11/8/2015.
 */
public class ZodiacDetailActivity extends Activity {

    public static final String EXTRA_SIGN = "ZodiacSign";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_detail);

        int signNum = (Integer) getIntent().getExtras().get(EXTRA_SIGN);
        Zodiac zodiac = Zodiac.signs[signNum];

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(zodiac.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(zodiac.getDescription());

        TextView symbol = (TextView) findViewById(R.id.symbol);
        symbol.setText(zodiac.getSymbol());

        TextView month = (TextView) findViewById(R.id.month);
        month.setText(zodiac.getMonth());

        // TextView daily  = (TextView)findViewById(R.id.daily);
        // new AsyncTaskParseJson().execute();

    }
}