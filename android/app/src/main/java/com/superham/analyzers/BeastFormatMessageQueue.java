package com.superham.analyzers;

import com.superham.analyzers.dump1090.ModeSMessage;

import java.util.concurrent.LinkedBlockingQueue;

public class BeastFormatMessageQueue {
	private static final LinkedBlockingQueue<ModeSMessage> sMessageQueue = new LinkedBlockingQueue<ModeSMessage>(
			100);

	public static void offer(ModeSMessage message) {
		if (message != null)
			while (!sMessageQueue.offer(message))
				sMessageQueue.poll();
	}

	public static ModeSMessage take() {
		try {
			return sMessageQueue.take();
		} catch (Exception e) {
			// swallow
			return null;
		}
	}

	public static int size() {
		return sMessageQueue.size();
	}

	public static void clear() {
		sMessageQueue.clear();
	}
}
