package com.se2.lab1;

import com.se2.lab1.pojo.UserSubmission;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    @FXML Label lblID;
    @FXML Label lblName;
    @FXML Label lblRank;
    @FXML Label lblSubmissions;
    @FXML Label lblAccepted;

    @FXML TextField txtUsername;

    @FXML TableView<UserSubmission> tblSubmissions;
    @FXML TableColumn<UserSubmission, Long> colSubID;
    @FXML TableColumn<UserSubmission, Long> colProblemID;
    @FXML TableColumn<UserSubmission, Long> colProblemTitle;
    @FXML TableColumn<UserSubmission, String> colLang;
    @FXML TableColumn<UserSubmission, String> colVerdict;
    @FXML TableColumn<UserSubmission, Date> colDate;
    @FXML TableColumn<UserSubmission, Long> colRank;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        colSubID.setCellValueFactory(new PropertyValueFactory("sid"));
        colProblemID.setCellValueFactory(new PropertyValueFactory("pid"));
        colProblemTitle.setCellValueFactory(new PropertyValueFactory("title"));
        colLang.setCellValueFactory(new PropertyValueFactory("lang"));
        colVerdict.setCellValueFactory(new PropertyValueFactory("verdict"));
        colDate.setCellValueFactory(new PropertyValueFactory("date"));
        colRank.setCellValueFactory(new PropertyValueFactory("rank"));

        tblReset(tblSubmissions);

    }

    private void tblReset(TableView tbl) { tbl.getItems().clear(); }

    public void btnStalkPressed() {

        tblReset(tblSubmissions);

    }

}
