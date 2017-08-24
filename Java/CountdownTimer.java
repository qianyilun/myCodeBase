// Make a count down timer
//https://www.youtube.com/watch?v=Euexl32lB8w

private void countdownTimer() {
    timer = new Timer();
    counter = 600;
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            System.out.println(counter);
            sendEmailBtn.setText("Send email Now " + " (or " + counter + " seconds)");
            counter--;
            if (counter == -1) {
                // send automatic emails
                sendEmailBtnActionPerformed(null);

                timer.cancel();
            }
        }
    };
    timer.scheduleAtFixedRate(task, 1000,1000);
}