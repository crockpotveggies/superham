package com.superham.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.SystemClock;

//import com.superham.App;
import com.superham.App;
import com.superham.services.ControllerService;
//import com.superham.services.LocationService;
import com.superham.util.UsbDvbDetector;

public class BootCompletedReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, Intent intent) {
		if (App.sPrefs.getBoolean("pref_auto_start_boot", true)) {
			final UsbDevice device = UsbDvbDetector.isValidDeviceConnected(context);
			
			if (device != null) {
				UsbManager usbManager = (UsbManager) context
						.getSystemService(Context.USB_SERVICE);
				if (usbManager.hasPermission(device)
						|| App.sPrefs.getBoolean("usb_permission_granted",
								false)) {
					new Thread() {
						@Override
						public void run() {
							SystemClock.sleep(300000);

							Intent service = new Intent(context, ControllerService.class);
							service.putExtra(UsbManager.EXTRA_DEVICE, device);

							context.startService(service);
						}
					}.start();
				}
			}
		}
	}
}
