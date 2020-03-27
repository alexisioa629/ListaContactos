package ec.edu.tecnologicoloja.contactlist.views;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ec.edu.tecnologicoloja.contactlist.R;
import ec.edu.tecnologicoloja.contactlist.adapter.ContactAdapter;

import ec.edu.tecnologicoloja.contactlist.manager.FirebaseContactManager;
import ec.edu.tecnologicoloja.contactlist.model.Contact;


public class ListActivity extends AppCompatActivity  implements AdapterView.OnItemClickListener{

    private ListView mListView;

    private ContactAdapter contactAdapter;
    private List<Contact> mListContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Set views
        mListView = (ListView) findViewById(R.id.listView);
        mListView.setOnItemClickListener(this);

        // Set contact list
        mListContacts = FirebaseContactManager.getInstance().getAllContacts();
        // check if list is null or empty to show the list or an informative text
        if (mListContacts != null && mListContacts.size() > 0) {
            mListView.setVisibility(View.VISIBLE);

            // Init adapter
            contactAdapter = new ContactAdapter(this, mListContacts);
            mListView.setAdapter(contactAdapter);
        } else {

            mListView.setVisibility(View.GONE);

        }


    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        // start detail screen when an item list is pressed
        //startActivity(ContactActivity.getIntent(this, mListContacts.get(position).getObjectId()));
        //Toast.makeText(this,"click sobre item",Toast.LENGTH_LONG).show();

        //obtener los datos del contacto
        String nombre= mListContacts.get(position).getName();
        String correo= mListContacts.get(position).getEmail();
        String ciudad= mListContacts.get(position).getCity();
        String telefono= mListContacts.get(position).getPhone();
        String descripcion= mListContacts.get(position).getDescription();
        String imagen= mListContacts.get(position).getImageUrl();





        Toast.makeText(this,""+nombre,Toast.LENGTH_LONG).show();

        //intent para cambiar a la actividad contact
        Intent iCambiarContacActi= new Intent(ListActivity.this,ContactActivity.class);
        // enviar los datos por medio de extras
        iCambiarContacActi.putExtra("putNombre",nombre);
        iCambiarContacActi.putExtra("putCorreo",correo);
        iCambiarContacActi.putExtra("putCiudad",ciudad);
        iCambiarContacActi.putExtra("putTelefono",telefono);
        iCambiarContacActi.putExtra("putDescripcion",descripcion);
        iCambiarContacActi.putExtra("putImagen",imagen);





       /* Bundle bundle= new Bundle();
        bundle.putSerializable("putContacto ",contacto);
        iCambiarContacActi.putExtras(bundle);*/
        startActivity(iCambiarContacActi);
    }
}
