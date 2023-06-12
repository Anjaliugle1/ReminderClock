
//IT IS A REMINDER PROGRAM FOR ELDERLY TO REMIND THEM TIME TO TIME ABOUT WATER, MEDINCINE ETC.
package prac2;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ReminderClock {
    private Timer timer;

    public ReminderClock() {
        timer = new Timer();
    }

    public void setReminder(Date reminderDate, String message) {
        timer.schedule(new ReminderTask(message), reminderDate);
    }

    private class ReminderTask extends TimerTask {
        private String message;

        public ReminderTask(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println("Reminder: " + message);
        }
    }

    public static void main(String[] args) {
        ReminderClock reminderClock = new ReminderClock();

        
        Date reminderDate1 = new Date(System.currentTimeMillis() + 5000);
        String message1 = "Don't forget to take your medication!";
        reminderClock.setReminder(reminderDate1, message1);

        Date reminderDate2 = new Date(System.currentTimeMillis() + 10000);
        String message2 = "Remember to drink water!";
        reminderClock.setReminder(reminderDate2, message2);

        Date reminderDate3 = new Date(System.currentTimeMillis() + 15000);
        String message3 = "Take a short walk!";
        reminderClock.setReminder(reminderDate3, message3);
    }
}