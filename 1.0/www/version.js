/**
 * 
 * Phonegap Version plugin for Android
 * Giuseppe Catalfamo 2013
 * gcatalfamo@gmail.com
 *
 */
var Version = function() {};
Version.prototype.getVersionCode = function(successCallback, failureCallback) {
    return cordova.exec(successCallback, failureCallback, 'Version', 'GetVersionCode', []);
};
Version.prototype.getVersionName = function(successCallback, failureCallback) {
    return cordova.exec(successCallback, failureCallback, 'Version', 'GetVersionName', []);
};

if(!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.version) {
    window.plugins.version = new Version();
}