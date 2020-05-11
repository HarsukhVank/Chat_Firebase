package com.prokarma.chat.firebase

import android.util.Log
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService {
    fun onMessageReceived(remoteMessage: RemoteMessage) {
        // Handle data payload of FCM messages.
        Log.d(TAG, "FCM Message Id: " + remoteMessage.messageId)
        Log.d(TAG, "FCM Notification Message: " + remoteMessage.notification)
        Log.d(TAG, "FCM Data Message: " + remoteMessage.data)
    }

    companion object {
        private const val TAG = "MyFMService"
    }
}