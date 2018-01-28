package productions.darthplagueis.testingnotifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by oleg on 1/28/18.
 */

public class MyAlarmReceiver extends BroadcastReceiver {

    public static final int REQUEST_CODE = 12345;
    public static final String ACTION = "nyc.c4q.notificationdemo.alarm";

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MyNotificationService.class);
        context.startService(i);
    }
}
