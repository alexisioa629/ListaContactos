package ec.edu.tecnologicoloja.contactlist.views;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ec.edu.tecnologicoloja.contactlist.R;
import ec.edu.tecnologicoloja.contactlist.adapter.ContactAdapter;
import ec.edu.tecnologicoloja.contactlist.manager.FirebaseContactManager;
import ec.edu.tecnologicoloja.contactlist.model.Contact;

public class ContactActivity  extends AppCompatActivity  {
    TextView txtNombre, txtCorreo, txtCiudad, txtTelefono, txtDescripcion;
    ImageView imageV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

    obtenerDatos();

    }
    //metodo para obtener los datos
    public void obtenerDatos(){
        //bundle para obtener datos de los extras
        Bundle recibirExtras=getIntent().getExtras();
        //reibir los datos en variables
        String recibirNombre= recibirExtras.getString("putNombre");
        String recibirCorreo= recibirExtras.getString("putCorreo");
        String recibirCiudad= recibirExtras.getString("putCiudad");
        String recibirTelefono= recibirExtras.getString("putTelefono");
        String recibirDescripcion= recibirExtras.getString("putDescripcion");
        //picasso para montar la imagen
        /*String recibirImagen= recibirExtras.getString("putImagen");
        Picasso.get().load(recibirImagen).into(imageV);
*/
        //setear los datos a los texViews
        txtNombre=(TextView) findViewById(R.id.textnombre);
        txtNombre.setText(recibirNombre);

        txtCorreo=(TextView) findViewById(R.id.textcorreo);
        txtCorreo.setText(recibirCorreo);

        txtCiudad=(TextView) findViewById(R.id.textciudad);
        txtCiudad.setText(recibirCiudad);

        txtTelefono=(TextView) findViewById(R.id.textelefono);
        txtTelefono.setText(recibirTelefono);

        txtDescripcion=(TextView) findViewById(R.id.textDescripcion);
        txtDescripcion.setText(recibirDescripcion);


    }

}
