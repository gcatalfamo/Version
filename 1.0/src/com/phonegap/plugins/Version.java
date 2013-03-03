package com.phonegap.plugins;

import org.json.JSONArray;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.apache.cordova.api.PluginResult.Status;

public class Version extends Plugin {

    public final String ACTION_GET_VERSION_NAME = "GetVersionName";
    public final String ACTION_GET_VERSION_CODE = "GetVersionCode";

    @Override
    public PluginResult execute(String action, JSONArray args, String callbackId) {
        PluginResult result = new PluginResult(Status.INVALID_ACTION);
        PackageManager packageManager = this.cordova.getActivity().getPackageManager();
        if(action.equals(ACTION_GET_VERSION_CODE)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getContext().getPackageName(), 0);
                result = new PluginResult(Status.OK, packageInfo.versionCode);
            }
            catch (NameNotFoundException nnfe) {
                result = new PluginResult(Status.ERROR, nnfe.getMessage());
            }
        }
		else if(action.equals(ACTION_GET_VERSION_NAME)) {
			try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getContext().getPackageName(), 0);
                result = new PluginResult(Status.OK, packageInfo.versionName);
            }
            catch (NameNotFoundException nnfe) {
                result = new PluginResult(Status.ERROR, nnfe.getMessage());
            }
		
		}

        return result;
    }
}