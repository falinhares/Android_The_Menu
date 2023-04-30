package br.com.forxon.themenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cvEntradas;
    CardView cvPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvEntradas=findViewById(R.id.cvEntradas);
        cvPrincipal=findViewById(R.id.cvPrincipal);

        cvEntradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entradasActivityIntent=new Intent(MainActivity.this, EntradasActivity.class);
                startActivity(entradasActivityIntent);
            }
        });

        cvPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entradasActivityIntent=new Intent(MainActivity.this, PrincipalActivity.class);
                startActivity(entradasActivityIntent);
            }
        });

        TextView tvEmail=findViewById(R.id.tvEmail);
        tvEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent=new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:falinhares@gmail.com"));
                startActivity(launchEmailAppIntent);
            }
        });
    }
}