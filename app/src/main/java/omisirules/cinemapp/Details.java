package omisirules.cinemapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.w3c.dom.Text;

import app.AppController;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent details = getIntent();
        ImageLoader imageLoader = AppController.getInstance().getImageLoader();
        TextView title = (TextView) findViewById(R.id.title);
        TextView realisateur = (TextView) findViewById(R.id.realisateur);
        TextView genre = (TextView) findViewById(R.id.genre);
        TextView year = (TextView) findViewById(R.id.releaseYear);
        TextView length = (TextView) findViewById(R.id.length);
        TextView synopsis = (TextView) findViewById(R.id.synopsis);
        NetworkImageView affiche =  (NetworkImageView) findViewById(R.id.thumbnail);

        if (details != null) {
            title.setText(details.getStringExtra("titre"));
            realisateur.setText("de " + details.getStringExtra("realisateur"));
            genre.setText(details.getStringExtra("genre"));
            synopsis.setText("Synopsis : " + "\n" + details.getStringExtra("synopsis"));
            year.setText("Année de sortie : " + details.getStringExtra("date"));
            length.setText("Durée : " + details.getStringExtra("duree") + "min");
            affiche.setImageUrl(details.getStringExtra("affiche"), imageLoader);
        }


    }
}
