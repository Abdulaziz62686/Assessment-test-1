

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aziz.miniapp.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.View_Holder> {
    private List<String> data_list;
    private Context context;

    public MyAdapter(Context context, List<String> data_list) {
        this.data_list = data_list;
    }

    //which child layout will be used
    @NonNull
    @Override
    public View_Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflaterVariable = LayoutInflater.from(parent.getContext());
        View view = inflaterVariable.inflate(R.layout.activity_item_recycle_, parent, false);
        View_Holder holder = new View_Holder(view);
        return holder;
    }

    //how dataset will be initialized
    @Override
    public void onBindViewHolder(@NonNull View_Holder holder, int position) {
        holder.textView.setText("Item no. "+(position+1)+". \n"+data_list.get(position));
    }

    //how many item will be created
    @Override
    public int getItemCount() {
        return data_list.size();
    }


    //item layout mapping
    public static class View_Holder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public View_Holder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
