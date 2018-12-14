package com.example.jhustin.leoprofe;


//Se importa la utilidad Lista
import java.util.List;


//Se importan los paquetes específicos del Retrofit
import retrofit2.Call;
import retrofit2.http.GET;



public interface Api {

    //Se declara el URL del servicio
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    //Se declara la extensión de la cual obtendremos la lista de heroes (En este caso: simplifiedcoding.net/demos/**marvel**)
    @GET("marvel")
    Call<List<Hero>> getHeroes(); //Se hace el llamado de la lista y se invoca al método getHeroes
}