package br.com.forxon.themenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lvPrincipal=findViewById(R.id.lvPrincipal);


        Dish[] dishes={
                new Dish("Pasta carbonara","Descrição aqui!", 1235),
                new Dish("Pizza","Bruschetas de tomate alho e manjerição. O clássico italiano!", 100),
                new Dish("Sanduíche de atum","Bruschetas de tomate alho e manjerição. O clássico italiano!", 1456),
                new Dish("Fettuccini","Bruschetas de tomate alho e manjerição. O clássico italiano!", 3456),
                new Dish("Almondegas ao sugo","Bruschetas de tomate alho e manjerição. O clássico italiano!", 1287),

        };

        //Para adaptar o array no formato do listview
        ArrayAdapter<Dish> dishesAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        lvPrincipal.setAdapter(dishesAdapter);
    }
}