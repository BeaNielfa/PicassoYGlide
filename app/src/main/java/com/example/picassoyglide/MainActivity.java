package com.example.picassoyglide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView logotipo, logotipoGlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logotipo = (ImageView) findViewById(R.id.imageViewLogotipo);
        logotipoGlide = (ImageView) findViewById(R.id.imageViewGlide);

        Picasso.get().load("https://www.hola.com/imagenes/estar-bien/20190820147813/razas-perros-pequenos-parecen-grandes/0-711-550/razas-perro-pequenos-grandes-m.jpg").into(logotipo);
        Glide.with(this)
                .load("https://live.mrf.io/statics/i/ps/www.ecestaticos.com/imagestatic/clipping/dfd/996/dfd996d0c22dd7e69412274972f5598d/por-que-nos-parece-que-los-perros-sonrien-una-historia-de-30-000-anos.jpg?mtime=1579565836")
                .into(logotipoGlide);
    }
}
