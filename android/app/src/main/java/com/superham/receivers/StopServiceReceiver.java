package com.superham.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.superham.services.ControllerService;

public class StopServiceReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		context.stopService(new Intent(context, ControllerService.class));
	}
}
