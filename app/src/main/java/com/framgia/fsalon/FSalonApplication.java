package com.framgia.fsalon;

import android.app.Application;

import com.framgia.fsalon.data.source.api.FSalonServiceClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 20/07/2017.
 */
public class FSalonApplication extends Application {
    private static FSalonApplication sInstant;
    private final static int a = 10;

    @Override
    public void onCreate() {
        super.onCreate();
        FSalonServiceClient.initialize(this);
        sInstant = this;
        List<String> a = new ArrayList<>();
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        a.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aisjdiasd sadijaisjd iasjd " +
            "iasjdiasjdiasjdiasjdiasdjisadjiasdjiasdjasidjasidjsai " +
            "asdsadasdasdasdasssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssdjasid");
    }

    public static FSalonApplication getInstant() {
        return sInstant;
    }
}
