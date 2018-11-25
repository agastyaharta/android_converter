package com.example.asus.unitconverter2;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.Toast;

/**
 * Created by ASUS on 4/22/2018.
 */


public class Menu1 extends Fragment {

    GridLayout mainGrid;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.menu1, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Unit ConverterLenght");

        mainGrid=(GridLayout) getView().findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);


    }

    private void setSingleEvent(GridLayout mainGrid) {
        //loop
        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            //child item
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //isi sama intent baru
                    if (finalI==0)
                    {
                        Intent intent = new Intent(Menu1.this.getActivity(), LenghtActivity.class);
                        Menu1.this.startActivity(intent);
                    }
                    else  if (finalI==1)
                    {
                        Intent intent = new Intent(Menu1.this.getActivity(), TempActivity.class);
                        Menu1.this.startActivity(intent);
                    }
                    else  if (finalI==2)
                    {
                        Intent intent = new Intent(Menu1.this.getActivity(), WeightActivity.class);
                        Menu1.this.startActivity(intent);
                    }
                    else  if (finalI==3)
                    {
                        Intent intent = new Intent(Menu1.this.getActivity(), AreaActivity.class);
                        Menu1.this.startActivity(intent);
                    }
                    else  if (finalI==4)
                    {
                        Intent intent = new Intent(Menu1.this.getActivity(), SpeedActivity.class);
                        Menu1.this.startActivity(intent);
                    }
                    else  if (finalI==5)
                    {
                        Intent intent = new Intent(Menu1.this.getActivity(), TimeActivity.class);
                        Menu1.this.startActivity(intent);
                    }

                }
            });
        }


    }

}
