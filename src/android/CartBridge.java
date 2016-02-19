package com.example.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("addGoodsToCart")) {

            String name = data.getString(0);
            String goods = data.getString(1);
            String pounds = data.getString(2);
            String message = "added to cart" + name + goods + pounds;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
