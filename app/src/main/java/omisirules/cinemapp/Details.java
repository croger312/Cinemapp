package omisirules.cinemapp;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

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
        //TextView test = (TextView) findViewById(R.id.testarray);
        NetworkImageView pic = (NetworkImageView) findViewById(R.id.pic);
        NetworkImageView pic2 = (NetworkImageView) findViewById(R.id.pic2);
        NetworkImageView pic3 = (NetworkImageView) findViewById(R.id.pic3);
        NetworkImageView pic4 = (NetworkImageView) findViewById(R.id.pic4);

        //Getting the urls for the pictures in the gallery
        ArrayList paths = new ArrayList();
        try {
            JSONArray mediaArray = new JSONArray(details.getStringExtra("media"));
            for(int i=0; i<mediaArray.length(); i++){
                paths.add(mediaArray.getJSONObject(i).getString("path"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if (details != null) {
            title.setText(details.getStringExtra("titre"));
            realisateur.setText("de " + details.getStringExtra("realisateur"));
            genre.setText(details.getStringExtra("genre"));
            synopsis.setText("Synopsis : " + "\n" + details.getStringExtra("synopsis"));
            year.setText("Année de sortie : " + details.getStringExtra("date"));
            length.setText("Durée : " + details.getStringExtra("duree") + "min");
            affiche.setImageUrl(details.getStringExtra("affiche"), imageLoader);
            //test.setText(paths.get(0).toString());
            pic.setImageUrl(paths.get(0).toString(), imageLoader);
            pic2.setImageUrl(paths.get(1).toString(), imageLoader);
            pic3.setImageUrl(paths.get(2).toString(), imageLoader);
            pic4.setImageUrl(paths.get(3).toString(), imageLoader);
        }


    }
}
