package fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.fragtments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener{

    private Button btnSecond;
    private EditText etSecond;


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_second, container, false);
        etSecond = view.findViewById(R.id.etSecond);
        btnSecond = view.findViewById(R.id.btnSecond);

        btnSecond.setOnClickListener(this);
        return view;


    }

    @Override
    public void onClick(View v) {

        float radius = Float.parseFloat(etSecond.getText().toString());
        float area = 3.14f * radius *radius;

        Toast.makeText(getActivity(), "Area of circle" + area, Toast.LENGTH_SHORT).show();
    }
}
