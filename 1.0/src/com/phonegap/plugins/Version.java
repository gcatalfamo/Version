package org.apache.cordova.plugin.Version;

import org.json.JSONArray;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.apache.cordova.api.PluginResult.Status;

public class Version extends CordovaPlugin {

    public final String ACTION_GET_VERSION_NAME = "GetVersionName";
    public final String ACTION_GET_VERSION_CODE = "GetVersionCode";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        boolean result = false;
        PackageManager packageManager = this.cordova.getActivity().getPackageManager();
        if(action.equals(ACTION_GET_VERSION_CODE)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getActivity().getPackageName(), 0);
                result = true;
                callbackContext.success(packageInfo.versionCode);
            }
            catch (NameNotFoundException nnfe) {
                result = false;
                callbackContext.success(nnfe.getMessage());
            }
        }
        else if(action.equals(ACTION_GET_VERSION_NAME)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getActivity().getPackageName(), 0);
                result = true;
                callbackContext.success(packageInfo.versionName);
            }
            catch (NameNotFoundException nnfe) {
                result = false;
                callbackContext.success(nnfe.getMessage());
            }
        
        }
        
        return result;
    }
}