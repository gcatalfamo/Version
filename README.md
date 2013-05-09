# Version plugin for Phonegap #

Version allows you to get, display and use the version name and version code of your PhoneGap application.

## Adding the Plugin to your project ##

Using this plugin requires [Android PhoneGap](http://github.com/phonegap/phonegap-android).

1. To install the plugin, move www/version.js to your project's www folder and include a reference to it in your html file after phonegap.js.

    &lt;script type="text/javascript" charset="utf-8" src="phonegap.js"&gt;&lt;/script&gt;<br/>
    &lt;script type="text/javascript" charset="utf-8" src="version.js"&gt;&lt;/script&gt;
    
2. Create a directory within your project called "src/com/phonegap/plugins/" and move Version.java into it.

3. In your res/xml/plugins.xml file add the following line:

    &lt;plugin name="Version" value="com.phonegap.plugins.Version"/&gt;

    CAUTION: Using PhoneGap ≥ 2.0 (aka Cordova) you have to add this line into res/xml/config.xml in the &lt;plugins&lt;-section. The plugins.xml is no longer supported. The plugins are all located in the config.xml

## Using the plugin ##

The plugin creates the object `window.plugins.version`.  To use, call one of the following, available methods:

	window.plugins.version.getVersionCode(
		function(version_code) {
			//do something with version_code
			console.log(version_code);
			
		},
		function(errorMessage) {
			//do something with errorMessage
			console.log(errorMessage);
			
		}
	);

	window.plugins.version.getVersionName(
		function(version_name) {
			//do something with version_name
			console.log(version_name);
			
		},
		function(errorMessage) {
			//do something with errorMessage
			console.log(errorMessage);
			
		}
	);


## RELEASE NOTES ##

### May 8th, 2013 ###

* Update to Cordova 2.7

### March 3rd, 2012 ###

* Initial release




## BUGS AND CONTRIBUTIONS ##

If you have a patch, fork my repo and send me a pull request. Submit bug reports on GitHub, please.

## LICENSE ##

The MIT License

Copyright (c) 2013 Giuseppe Catalfamo

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
