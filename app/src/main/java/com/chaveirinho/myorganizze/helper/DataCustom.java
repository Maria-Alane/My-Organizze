package com.chaveirinho.myorganizze.helper;

import java.text.SimpleDateFormat;

public class DataCustom {

    public static String dataAtual(){

        long data = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = simpleDateFormat.format(data);
        return  dataString;

    }

}
