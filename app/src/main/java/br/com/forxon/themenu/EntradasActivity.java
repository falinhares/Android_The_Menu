package br.com.forxon.themenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EntradasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        ListView lvEntradas=findViewById(R.id.lvEntradas);


        Dish[] dishes={
                new Dish("Bruschettinha","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Farfale","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Ostras","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Crostini","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Pão de alho","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Cogumelos porcini","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Torradinhas de espinafre","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Carpaccio","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Quibe","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Esfirra","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Pão de queijo","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Mini sanduiches","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Micro pizza","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),
                new Dish("Frios","Bruschetas de tomate alho e manjerição. O clássico italiano!", 999),

        };

        //Para adaptar o array no formato do listview
        ArrayAdapter<Dish>dishesAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        lvEntradas.setAdapter(dishesAdapter);

    }
}