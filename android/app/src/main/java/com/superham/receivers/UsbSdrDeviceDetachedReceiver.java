package com.superham.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.superham.MainActivity;

public class UsbSdrDeviceDetachedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		intent.setClass(context, MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

		context.startActivity(intent);
	}
}
