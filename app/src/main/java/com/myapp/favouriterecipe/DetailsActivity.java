package com.myapp.favouriterecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {


    ImageView imgRecipe;
    TextView txtName,txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgRecipe=findViewById(R.id.img_recipe);
        txtName=findViewById(R.id.txt_name);
        txtDescription=findViewById(R.id.txt_description);

        String getId=getIntent().getExtras().getString("id");

        if (getId.equals("one"))
        {
            imgRecipe.setImageResource(R.drawable.falafel_burgers);
            txtName.setText("Falafel Burger");
            txtDescription.setText(R.string.falafel_burger);
        }

        else if (getId.equals("two"))
        {
            imgRecipe.setImageResource(R.drawable.chicken_biriyani);
            txtName.setText("Chicken Biriyani");
            txtDescription.setText(R.string.chicken_biriyani);
        }

        else if (getId.equals("three"))
        {
            imgRecipe.setImageResource(R.drawable.cake);
            txtName.setText("Chocolate Cake");
            txtDescription.setText(R.string.chocolate_cake);
        }


        else if (getId.equals("four"))
        {
            imgRecipe.setImageResource(R.drawable.pizza);
            txtName.setText("Mexican Pizza");
            txtDescription.setText(R.string.mexican_pizza);
        }

    }
}
