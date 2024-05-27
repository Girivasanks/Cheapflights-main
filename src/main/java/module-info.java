module Cheapflights.Cheapflights {
    requires javafx.controls;
    requires javafx.fxml;
        requires java.xml;
        requires javafx.graphics;


        opens Cheapflights.Cheapflights to javafx.fxml;
    exports Cheapflights.Cheapflights;
    exports Cheapflights.Cheapflights.Admin;
    opens Cheapflights.Cheapflights.Admin to javafx.fxml;
    exports Cheapflights.Cheapflights.Flight;
    opens Cheapflights.Cheapflights.Flight to javafx.fxml;
    exports Cheapflights.Cheapflights.User;
    opens Cheapflights.Cheapflights.User to javafx.fxml;
    exports Cheapflights.Cheapflights.Payment;
    opens Cheapflights.Cheapflights.Payment to javafx.fxml;
    exports Cheapflights.Cheapflights.Seat;
    opens Cheapflights.Cheapflights.Seat to javafx.fxml;
    exports Cheapflights.Cheapflights.Passenger;
    opens Cheapflights.Cheapflights.Passenger to javafx.fxml;
    exports Cheapflights.Cheapflights.File;
    opens Cheapflights.Cheapflights.File to javafx.fxml;
    exports Cheapflights.Cheapflights.Booking;
    opens Cheapflights.Cheapflights.Booking to javafx.fxml;
    exports Cheapflights.Cheapflights.Miscellaneous;
    opens Cheapflights.Cheapflights.Miscellaneous to javafx.fxml;
}