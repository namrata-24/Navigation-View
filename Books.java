package com.example.lenovo.pasttime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lenovo on 12/14/2017.
 */

public class Books extends Fragment {

    public TextView text ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.books,container,false);
        WebView web = (WebView)v.findViewById(R.id.web);
        web.loadUrl("www.google.com");
/*Button b = (Button)v.findViewById(R.id.button);
        text = (TextView)v.findViewById(R.id.text);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("Hello , program running sucessfully !!");
            }
        }); */


        return v  ;
    }
}
