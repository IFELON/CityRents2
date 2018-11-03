package in.vaaraahi.cityrents;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGrid extends BaseAdapter {

    Context context;
    String[] name;
    int[] image;


    public CustomGrid(Context context, int[] image, String[] name) {

        this.context = context;
        this.image = image;
        this.name = name;

        Log.d("adapter","adapter called");

    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;


            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            grid = layoutInflater.inflate(R.layout.gridlayout, null);
            TextView textView = grid.findViewById(R.id.texts);
            ImageView imageView = grid.findViewById(R.id.images);

            imageView.setImageResource(image[position]);
            textView.setText(name[position]);


        return grid;
    }

}