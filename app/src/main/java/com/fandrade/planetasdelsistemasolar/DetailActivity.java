package com.fandrade.planetasdelsistemasolar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.fandrade.planetasdelsistemasolar.model.ItemList;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgItemDetail,imgCaracteristicasDetail,imgRegresar;
    private TextView tvTituloDetail;
    private ItemList itemDetail;
    private TextView tvDescripcionDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
        initValues();
        imgRegresar = findViewById(R.id.btnregresar);
        imgRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void initViews(){
        imgItemDetail = findViewById(R.id.tvimgItemDetail);
        tvTituloDetail = findViewById(R.id.tvTituloDetail);
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail);
        imgCaracteristicasDetail = findViewById(R.id.tvcaracteristicasItemDetail);
    }
    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras().getSerializable("itemDetail");
        imgItemDetail.setImageResource(itemDetail.getImgResource());
        tvTituloDetail.setText(itemDetail.getTitulo());
        tvDescripcionDetail.setText(itemDetail.getDescripcion());
        imgCaracteristicasDetail.setImageResource(itemDetail.getImgCaracteristicas());


    }
}