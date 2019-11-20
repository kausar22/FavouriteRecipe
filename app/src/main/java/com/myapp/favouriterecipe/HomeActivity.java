package com.myapp.favouriterecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnRecipe1,btnRecipe2,btnRecipe3,btnRecipe4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnRecipe1=findViewById(R.id.btn_recipe1);
        btnRecipe2=findViewById(R.id.btn_recipe2);
        btnRecipe3=findViewById(R.id.btn_recipe3);
        btnRecipe4=findViewById(R.id.btn_recipe4);


        btnRecipe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","one");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Falafel Burger", Toast.LENGTH_SHORT).show();
            }
        });



        btnRecipe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","two");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chicken Biriyani", Toast.LENGTH_SHORT).show();
            }
        });


        btnRecipe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","three");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Chocolate Cake", Toast.LENGTH_SHORT).show();
            }
        });


        btnRecipe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","four");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Mexican Pizza", Toast.LENGTH_SHORT).show();
            }
        });





    }
}
