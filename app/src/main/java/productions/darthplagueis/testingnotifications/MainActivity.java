package productions.darthplagueis.testingnotifications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scheduleAlarm();
    }

    public void scheduleAlarm() {
        Intent intent = new Intent(getApplicationContext(), MyNotificationService.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), MyAlarmReceiver.REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        long firstMillis = System.currentTimeMillis();
        AlarmManager alarm = (AlarmManager) this.getSystemService(Context.ALARM_SERVICE);
        try {
            alarm.setInexactRepeating(AlarmManager.RTC_WAKEUP, firstMillis, 5000L, pendingIntent);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
