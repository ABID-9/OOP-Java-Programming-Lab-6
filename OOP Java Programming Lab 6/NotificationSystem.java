class NotificationSystem {

    void sendNotification(String message) {
    System.out.println("Broadcast Alert: " + message);
    }

    void sendNotification(String message, String email) {
 System.out.println("Email sent to " + email + " -> " + message);
    }

    void sendNotification(String message, long phoneNumber) {
 System.out.println("SMS sent to +" + phoneNumber + " -> " + message);
    }

    public static void main(String[] args) {
  NotificationSystem n = new NotificationSystem();

 n.sendNotification("Server restart in 5 mins.");


   n.sendNotification("Your OTP is 4432", "user@test.com");
   
   n.sendNotification("Package delivered!", 15550199L);
    }
}