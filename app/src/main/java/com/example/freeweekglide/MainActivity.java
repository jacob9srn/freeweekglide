package com.example.freeweekglide;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {



        TextView tv_name;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tv_name = (TextView) findViewById(R.id.tv_hi);

        imageView = (ImageView) findViewById(R.id.iv_glide);
        Glide.with(this).load("http://wtimg.webtooninsight.co.kr/webtoonthumbnail/wi_131405132336691626.jpg"
        ).into(imageView);

    }

    public void btn_hihi(View view) {


        final AlertDialog.Builder alert
                =new AlertDialog.Builder(this);
        View mView = getLayoutInflater().inflate(R.layout.custom_dialog,null);

        final EditText et_entername = (EditText)mView.findViewById(R.id.et_entername22);
        Button btn_cancel = (Button) mView.findViewById(R.id.btn_cancel);
        Button btn_ok = (Button) mView.findViewById(R.id.btn_ok);

        alert.setView(mView);
        final AlertDialog alertDialog = alert.create();
        alertDialog.setCanceledOnTouchOutside(false); //

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();

            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   tv_name.setText(et_entername.getText());
            }
        });
              alertDialog.show();
    }
}
