package com.kevoroid.foodshop;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.kevoroid.foodshop.apis.ApiEndpoints;
import com.kevoroid.foodshop.models.repos.MasterRepo;

public class YummyApplication extends Application {

	@SuppressLint("StaticFieldLeak")
	private static Context mContext;

	private static YummyComponent yummyComponent;

	@Override
	public void onCreate() {
		super.onCreate();

		YummyApplication.mContext = getApplicationContext();

		yummyComponent = DaggerYummyComponent.create();
	}

	public static MasterRepo getRepo() {
		return yummyComponent.getRepo();
	}

	public static ApiEndpoints getRetroMaster() {
		return yummyComponent.getRetroMaster();
	}

	public static Context getContext() {
		return mContext;
	}
}
