package com.cotanz.sunshine.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);
        String[] weatherForecast={ "Mon 6/23 - Sunny - 31/17",
                                    "Tue 6/24 - Foggy - 21/8",
                                    "Wed 6/25 - Cloudy - 22/17",
                                    "Thurs 6/26 - Rainy - 18/11",
                                    "Fri 6/27 - Foggy - 21/10",
                                    "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                                    "Sun 6/29 - Sunny - 20/7"};
        List<String> weather=new ArrayList<String>(Arrays.asList(weatherForecast));

        ArrayAdapter<String> mForecastWeather=new ArrayAdapter<String>(getActivity(),R.layout.weather,R.id.weather_list_item,weather);
        ListView list= (ListView)rootView.findViewById(R.id.weather_forecast_list);
        list.setAdapter(mForecastWeather);
        return rootView;
    }
}
