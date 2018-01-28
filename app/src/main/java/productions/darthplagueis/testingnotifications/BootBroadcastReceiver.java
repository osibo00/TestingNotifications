package productions.darthplagueis.testingnotifications;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by oleg on 1/28/18.
 */

public class BootBroadcastReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, MyNotificationService.class);
        startWakefulService(context, startServiceIntent);
    }
}
