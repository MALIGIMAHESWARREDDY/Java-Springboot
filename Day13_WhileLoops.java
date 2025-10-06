class Day13 {
    public static void main(String[] args) {
        String[] Titles = {"javaDay1", "javaDay2", "JavaDay3", "javaDay4"};
        int i = 0;
        while (i < Titles.length) {
            System.out.println(Titles[i]);
            i++;
        }

        String[] emails = {"mahes@gmail.com", "maligi@gmail.com", "jeevan@gmail.com"};
        boolean isEmailSent = false;
        int index = 0;

        while (index < emails.length && !isEmailSent) {
            if (emails[index].equals("maligi@gmail.com")) {
                System.out.println("Email sent to " + emails[index]);
                isEmailSent = true;
            }
            index++;
        }

        if (!isEmailSent) {
            System.out.println("Email not found.");
        }
    }
}
