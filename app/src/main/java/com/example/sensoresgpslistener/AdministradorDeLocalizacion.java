package com.example.sensoresgpslistener;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

public class AdministradorDeLocalizacion implements LocationListener {
    private Context context;

    public AdministradorDeLocalizacion(Context context) {
        this.context = context;
    }

    @Override
    public void onLocationChanged(Location location) {
        Toast.makeText(context,"Longitud "+location.getLongitude()+" Latitud: "+location.getLatitude()
                ,Toast.LENGTH_LONG).show();

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
