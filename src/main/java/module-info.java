module com.demo.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.demo.javafxdemo to javafx.fxml;
    exports com.demo.javafxdemo;
}