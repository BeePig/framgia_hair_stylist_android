package com.framgia.fsalon.data.source;

import com.framgia.fsalon.data.model.UserRespone;

import rx.Observable;

/**
 * Created by MyPC on 20/07/2017.
 */
public interface UserDataSource {
    interface LocalDataSource {
    }

    interface RemoteDataSource {
        Observable<UserRespone> login(String account, String passWord);
    }
}